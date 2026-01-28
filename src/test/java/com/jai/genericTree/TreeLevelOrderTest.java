package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TreeLevelOrderTest
{
	private TreeNode root;
	private ByteArrayOutputStream outContent;
	private PrintStream originalOut;

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

		// Capture System.out
		outContent = new ByteArrayOutputStream();
		originalOut = System.out;
	}

	@AfterEach
	public void tearDown()
	{
		System.setOut(originalOut);
	}

	@Test
	public void testLevelOrder()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrder(root);
		String output = outContent.toString().trim();

		// Should print: 10 20 30 40 50 70
		assertTrue(output.contains("10"));
		assertTrue(output.contains("20"));
		assertTrue(output.contains("30"));
		assertTrue(output.contains("40"));
		assertTrue(output.contains("50"));
		assertTrue(output.contains("70"));
	}

	@Test
	public void testLevelOrderLineWise()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrderLineWise(root);
		String output = outContent.toString();

		String[] lines = output.trim().split("\\n");
		// Should have multiple lines
		assertTrue(lines.length > 1);
		// First line should have 10
		assertTrue(lines[0].contains("10"));
	}

	@Test
	public void testLevelOrderLineWise2()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrderLineWise2(root);
		String output = outContent.toString();

		String[] lines = output.trim().split("\\n");
		// Should have multiple lines
		assertTrue(lines.length > 1);
		// First line should have 10
		assertTrue(lines[0].contains("10"));
	}

	@Test
	public void testLevelOrderLineWise3()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrderLineWise3(root);
		String output = outContent.toString();

		String[] lines = output.trim().split("\\n");
		// Should have multiple lines
		assertTrue(lines.length > 1);
		// First line should have 10
		assertTrue(lines[0].contains("10"));
	}

	@Test
	public void testLevelOrderLineWise4()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrderLineWise4(root);
		String output = outContent.toString();

		String[] lines = output.trim().split("\\n");
		// Should have multiple lines
		assertTrue(lines.length > 1);
		// First line should have 10
		assertTrue(lines[0].contains("10"));
	}

	@Test
	public void testLevelOrderWithSingleNode()
	{
		System.setOut(new PrintStream(outContent));
		TreeNode singleNode = new TreeNode(5);
		TreeLevelOrder.levelOrder(singleNode);
		String output = outContent.toString().trim();

		assertEquals("5", output);
	}

	@Test
	public void testLevelOrderZigZag()
	{
		System.setOut(new PrintStream(outContent));
		TreeLevelOrder.levelOrderLinewiseZigZag(root);
		String output = outContent.toString();

		// Should contain all nodes
		assertTrue(output.contains("10"));
		assertTrue(output.contains("20"));
		assertTrue(output.contains("30"));
		assertTrue(output.contains("40"));
		assertTrue(output.contains("50"));
		assertTrue(output.contains("70"));
	}
}
