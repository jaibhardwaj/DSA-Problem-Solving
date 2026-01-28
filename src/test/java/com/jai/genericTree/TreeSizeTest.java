package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeSizeTest
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
	public void testSizeOfTree()
	{
		int size = TreeSize.size(root);
		assertEquals(6, size);
	}

	@Test
	public void testSizeOfSingleNode()
	{
		TreeNode singleNode = new TreeNode(1);
		int size = TreeSize.size(singleNode);
		assertEquals(1, size);
	}

	@Test
	public void testSizeWithDeepTree()
	{
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);

		node1.addChild(node2);
		node2.addChild(node3);
		node3.addChild(node4);

		int size = TreeSize.size(node1);
		assertEquals(4, size);
	}
}
