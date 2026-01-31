package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindElementInGenericTreeTest
{
	private TreeNode root;

	@BeforeEach
	public void setUp()
	{
		// Create test tree:
		//       10
		//    /  |  \
		//   20 30  40
		//   |  |
		//  50 70
		root = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);

		root.addChild(node20);
		root.addChild(node30);
		root.addChild(node40);
		node20.addChild(node50);
		node30.addChild(node70);
	}

	@Test
	public void testFindElementAtRoot()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 10));
	}

	@Test
	public void testFindElementInLeftChild()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 20));
	}

	@Test
	public void testFindElementInMiddleChild()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 30));
	}

	@Test
	public void testFindElementInRightChild()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 40));
	}

	@Test
	public void testFindElementInNestedChild()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 50));
	}

	@Test
	public void testFindElementInDeepNestedChild()
	{
		assertTrue(FindElementInGenericTree.findElement(root, 70));
	}

	@Test
	public void testElementNotFound()
	{
		assertFalse(FindElementInGenericTree.findElement(root, 100));
	}

	@Test
	public void testFindElementInSingleNodeTree()
	{
		TreeNode singleNode = new TreeNode(5);
		assertTrue(FindElementInGenericTree.findElement(singleNode, 5));
	}

	@Test
	public void testElementNotFoundInSingleNodeTree()
	{
		TreeNode singleNode = new TreeNode(5);
		assertFalse(FindElementInGenericTree.findElement(singleNode, 10));
	}

	@Test
	public void testFindNegativeNumber()
	{
		TreeNode tree = new TreeNode(-10);
		TreeNode child1 = new TreeNode(-5);
		TreeNode child2 = new TreeNode(-20);
		tree.addChild(child1);
		tree.addChild(child2);

		assertTrue(FindElementInGenericTree.findElement(tree, -20));
	}

	@Test
	public void testFindZero()
	{
		TreeNode tree = new TreeNode(0);
		assertTrue(FindElementInGenericTree.findElement(tree, 0));
	}

	@Test
	public void testFindElementInLargeTree()
	{
		// Create a larger tree
		TreeNode tree = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		tree.addChild(node2);
		tree.addChild(node3);
		node2.addChild(node4);
		node2.addChild(node5);
		node3.addChild(node6);
		node3.addChild(node7);

		assertTrue(FindElementInGenericTree.findElement(tree, 7));
		assertFalse(FindElementInGenericTree.findElement(tree, 10));
	}
}
