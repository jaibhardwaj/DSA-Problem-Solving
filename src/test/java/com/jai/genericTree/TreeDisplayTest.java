package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TreeDisplayTest
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
		root = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);
		TreeNode node40 = new TreeNode(40);

		root.addChild(node20);
		root.addChild(node30);
		root.addChild(node40);

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
	public void testDisplaySimpleTree()
	{
		System.setOut(new PrintStream(outContent));
		TreeDisplay.display(root);
		String output = outContent.toString();

		assertTrue(output.contains("10 -> 20, 30, 40"));
		assertTrue(output.contains("20 ->"));
		assertTrue(output.contains("30 ->"));
		assertTrue(output.contains("40 ->"));
	}

	@Test
	public void testDisplaySingleNode()
	{
		System.setOut(new PrintStream(outContent));
		TreeNode singleNode = new TreeNode(5);
		TreeDisplay.display(singleNode);
		String output = outContent.toString();

		assertTrue(output.contains("5 -> ."));
	}

	@Test
	public void testDisplayWithNestedChildren()
	{
		System.setOut(new PrintStream(outContent));
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.addChild(node2);
		node2.addChild(node3);

		TreeDisplay.display(node1);
		String output = outContent.toString();

		assertTrue(output.contains("1 -> 2"));
		assertTrue(output.contains("2 -> 3"));
		assertTrue(output.contains("3 -> ."));
	}
}
