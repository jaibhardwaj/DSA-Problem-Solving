package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TreeTraversalTest
{
	private TreeNode root;
	private ByteArrayOutputStream outContent;
	private PrintStream originalOut;

	@BeforeEach
	public void setUp()
	{
		// Create test tree:
		//       10
		//    /  \
		//   20  30
		root = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node30 = new TreeNode(30);

		root.addChild(node20);
		root.addChild(node30);

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
	public void testTraversalOutputStructure()
	{
		System.setOut(new PrintStream(outContent));
		TreeTraversal.traverse(root);
		String output = outContent.toString();

		// Check for Node Pre and Node Post
		assertTrue(output.contains("Node Pre 10"));
		assertTrue(output.contains("Node Post 10"));

		// Check for Edge Pre and Edge Post
		assertTrue(output.contains("Edge Pre 10--20"));
		assertTrue(output.contains("Edge Post 10--20"));
		assertTrue(output.contains("Edge Pre 10--30"));
		assertTrue(output.contains("Edge Post 10--30"));
	}

	@Test
	public void testTraversalWithSingleNode()
	{
		System.setOut(new PrintStream(outContent));
		TreeNode singleNode = new TreeNode(5);
		TreeTraversal.traverse(singleNode);
		String output = outContent.toString();

		assertTrue(output.contains("Node Pre 5"));
		assertTrue(output.contains("Node Post 5"));
		assertFalse(output.contains("Edge"));
	}

	@Test
	public void testTraversalDepthOrder()
	{
		System.setOut(new PrintStream(outContent));
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.addChild(node2);
		node2.addChild(node3);

		TreeTraversal.traverse(node1);
		String output = outContent.toString();

		// Node Pre 1 should come before Edge Pre 1--2
		int nodePrePos = output.indexOf("Node Pre 1");
		int edgePrePos = output.indexOf("Edge Pre 1--2");
		assertTrue(nodePrePos < edgePrePos);

		// Edge Pre 1--2 should come before Node Pre 2
		int nodePrePos2 = output.indexOf("Node Pre 2");
		assertTrue(edgePrePos < nodePrePos2);
	}
}
