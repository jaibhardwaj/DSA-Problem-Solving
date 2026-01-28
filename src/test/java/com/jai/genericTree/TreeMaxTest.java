package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeMaxTest
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
	public void testMaxOfTree()
	{
		int max = TreeMax.max(root);
		assertEquals(70, max);
	}

	@Test
	public void testMaxOfSingleNode()
	{
		TreeNode singleNode = new TreeNode(15);
		int max = TreeMax.max(singleNode);
		assertEquals(15, max);
	}

	@Test
	public void testMaxWithNegativeNumbers()
	{
		TreeNode node1 = new TreeNode(-5);
		TreeNode node2 = new TreeNode(-10);
		TreeNode node3 = new TreeNode(-3);

		node1.addChild(node2);
		node1.addChild(node3);

		int max = TreeMax.max(node1);
		assertEquals(-3, max);
	}

	@Test
	public void testMaxWithMixedNumbers()
	{
		root = new TreeNode(15);
		TreeNode node20 = new TreeNode(5);
		TreeNode node30 = new TreeNode(25);
		TreeNode node40 = new TreeNode(10);

		root.addChild(node20);
		root.addChild(node30);
		root.addChild(node40);

		int max = TreeMax.max(root);
		assertEquals(25, max);
	}
}
