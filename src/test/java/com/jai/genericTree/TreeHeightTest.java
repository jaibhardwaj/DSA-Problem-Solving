package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeHeightTest
{
	private TreeNode root;

	@BeforeEach
	public void setUp()
	{
		// Create test tree:
		//       10        (height 0)
		//    /  |  \
		//   20 30  40     (height 1)
		//   |  |
		//  50 70          (height 2)
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
	public void testHeightOfTree()
	{
		int height = TreeHeight.height(root);
		assertEquals(2, height);
	}

	@Test
	public void testHeightOfSingleNode()
	{
		TreeNode singleNode = new TreeNode(1);
		int height = TreeHeight.height(singleNode);
		assertEquals(0, height);
	}

	@Test
	public void testHeightOfDeepTree()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.addChild(node2);
		node2.addChild(node3);
		node3.addChild(node4);
		node4.addChild(node5);

		int height = TreeHeight.height(node1);
		assertEquals(4, height);
	}

	@Test
	public void testHeightWithMultipleChildren()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);

		node1.addChild(node2);
		node1.addChild(node3);
		node2.addChild(node4);
		node3.addChild(node5);

		int height = TreeHeight.height(node1);
		assertEquals(2, height);
	}
}
