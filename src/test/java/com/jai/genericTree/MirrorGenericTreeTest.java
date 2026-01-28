package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorGenericTreeTest
{
	private TreeNode root;

	@BeforeEach
	public void setUp()
	{
		// Create test tree:
		//       10
		//    /  |  \
		//   20 30  40
		//   |  |   |
		//  50 70  80
		root = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		TreeNode node80 = new TreeNode(80);

		root.addChild(node20);
		root.addChild(node30);
		root.addChild(node40);
		node20.addChild(node50);
		node30.addChild(node70);
		node40.addChild(node80);
	}

	@Test
	public void testMirrorSimpleTree()
	{
		// Before mirror: 10 -> [20, 30, 40]
		assertEquals(3, root.children.size());
		assertEquals(20, root.children.get(0).data);
		assertEquals(30, root.children.get(1).data);
		assertEquals(40, root.children.get(2).data);

		// Apply mirror
		MirrorGenericTree.mirror(root);

		// After mirror: 10 -> [40, 30, 20]
		assertEquals(3, root.children.size());
		assertEquals(40, root.children.get(0).data);
		assertEquals(30, root.children.get(1).data);
		assertEquals(20, root.children.get(2).data);
	}

	@Test
	public void testMirrorSingleNode()
	{
		TreeNode singleNode = new TreeNode(1);
		// Single node has no children, mirror should not affect it
		MirrorGenericTree.mirror(singleNode);
		assertEquals(0, singleNode.children.size());
	}

	@Test
	public void testMirrorSingleChild()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		node1.addChild(node2);

		// Before mirror: 1 -> [2]
		assertEquals(1, node1.children.size());
		assertEquals(2, node1.children.get(0).data);

		// Apply mirror
		MirrorGenericTree.mirror(node1);

		// After mirror: 1 -> [2] (no change with single child)
		assertEquals(1, node1.children.size());
		assertEquals(2, node1.children.get(0).data);
	}

	@Test
	public void testMirrorNestedTree()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.addChild(node2);
		node1.addChild(node3);
		node2.addChild(node4);
		node2.addChild(node5);

		// Before mirror: 2 -> [4, 5]
		assertEquals(2, node2.children.size());
		assertEquals(4, node2.children.get(0).data);
		assertEquals(5, node2.children.get(1).data);

		// Apply mirror
		MirrorGenericTree.mirror(node1);

		// After mirror: node1 -> [3, 2] and 2 -> [5, 4]
		assertEquals(2, node1.children.size());
		assertEquals(3, node1.children.get(0).data);
		assertEquals(2, node1.children.get(1).data);

		// Check that node2's children are also mirrored
		assertEquals(2, node2.children.size());
		assertEquals(5, node2.children.get(0).data);
		assertEquals(4, node2.children.get(1).data);
	}

	@Test
	public void testMirrorWithMultipleChildren()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.addChild(node2);
		node1.addChild(node3);
		node1.addChild(node4);
		node1.addChild(node5);

		// Before mirror: 1 -> [2, 3, 4, 5]
		assertEquals(4, node1.children.size());
		assertEquals(2, node1.children.get(0).data);
		assertEquals(3, node1.children.get(1).data);
		assertEquals(4, node1.children.get(2).data);
		assertEquals(5, node1.children.get(3).data);

		// Apply mirror
		MirrorGenericTree.mirror(node1);

		// After mirror: 1 -> [5, 4, 3, 2]
		assertEquals(4, node1.children.size());
		assertEquals(5, node1.children.get(0).data);
		assertEquals(4, node1.children.get(1).data);
		assertEquals(3, node1.children.get(2).data);
		assertEquals(2, node1.children.get(3).data);
	}

	@Test
	public void testMirrorIsIdempotent()
	{
		// Create a fresh tree for this test
		TreeNode test = new TreeNode(1);
		TreeNode test2 = new TreeNode(2);
		TreeNode test3 = new TreeNode(3);
		test.addChild(test2);
		test.addChild(test3);

		// Store original order
		assertEquals(2, test.children.get(0).data);
		assertEquals(3, test.children.get(1).data);

		// Mirror once
		MirrorGenericTree.mirror(test);
		assertEquals(3, test.children.get(0).data);
		assertEquals(2, test.children.get(1).data);

		// Mirror twice (should return to original)
		MirrorGenericTree.mirror(test);
		assertEquals(2, test.children.get(0).data);
		assertEquals(3, test.children.get(1).data);
	}

	@Test
	public void testMirrorPreservesData()
	{
		// Mirror should only reverse children order, not affect node data
		MirrorGenericTree.mirror(root);

		// Verify all nodes still have correct data values
		assertEquals(10, root.data);
		assertTrue(root.children.stream().anyMatch(child -> child.data == 20));
		assertTrue(root.children.stream().anyMatch(child -> child.data == 30));
		assertTrue(root.children.stream().anyMatch(child -> child.data == 40));
	}

	@Test
	public void testMirrorDeepTree()
	{
		// Create a deep linear tree: 1 -> 2 -> 3 -> 4 -> 5
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);

		n1.addChild(n2);
		n2.addChild(n3);
		n3.addChild(n4);
		n4.addChild(n5);

		// All nodes have single child, mirror should not change structure
		MirrorGenericTree.mirror(n1);

		// Verify structure is preserved
		assertEquals(1, n1.children.size());
		assertEquals(n2, n1.children.get(0));
		assertEquals(1, n2.children.size());
		assertEquals(n3, n2.children.get(0));
		assertEquals(1, n3.children.size());
		assertEquals(n4, n3.children.get(0));
		assertEquals(1, n4.children.size());
		assertEquals(n5, n4.children.get(0));
	}
}
