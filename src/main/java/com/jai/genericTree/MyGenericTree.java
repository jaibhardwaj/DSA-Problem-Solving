package com.jai.genericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyGenericTree
{

	public static class TreeNode
	{
		int data;
		ArrayList<TreeNode> children = new ArrayList<>();

		TreeNode(int data)
		{
			this.data = data;
		}

		public void addChild(TreeNode child)
		{
			children.add(child);
		}

		public String toString()
		{
			return "TreeNode{" + "data=" + data + ", children=" + children + '}';
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		TreeNode root = null;
		Stack<TreeNode> st = new Stack<>();
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == -1)
			{
				st.pop();
			} 
			else
			{
				TreeNode t = new TreeNode(arr[i]);
				if ( !st.isEmpty() )
				{
					st.peek().addChild(t);
				} 
				else
				{
					root = t;
				}
				st.push(t);
			}
		}

		display(root);
		System.out.println("Size of tree: " + size(root));
		System.out.println("Max of tree: " + max(root));
		System.out.println("Height of tree: " + height(root));
		System.out.println("Tree Traversal:");
		traverse(root);

		System.out.println("Level Order Traversal:");
		levelOrder(root);

		System.out.println("\nLevel Order Line Wise Traversal:");
		levelOrderLineWise(root);
	}

	public static void display(TreeNode node)
	{
		StringBuilder str = new StringBuilder(node.data + " -> ");
		for (TreeNode child : node.children)
		{
			str.append(child.data).append(", ");
		}
		str.append(".");
		System.out.println(str);

		for (TreeNode child : node.children)
		{
			display(child);
		}
	}

	public static int size(TreeNode node)
	{
		int s = 0;

		for (TreeNode child : node.children)
		{
			s += size(child);
		}
		s += 1;

		return s;
	}

	public static int max(TreeNode node)
	{
		int m = Integer.MIN_VALUE;

		for (TreeNode child : node.children)
		{
			int cm = max(child);
			m = Math.max(m, cm);
		}
		m = Math.max(m, node.data);

		return m;
	}

	public static int height(TreeNode node)
	{
		int h = -1;

		for (TreeNode child : node.children)
		{
			int ch = height(child);
			h = Math.max(h, ch);
		}
		h += 1;

		return h;
	}

	public static void traverse(TreeNode node)
	{
		System.out.println("Node Pre " + node.data);

		for (TreeNode child : node.children)
		{
			System.out.println("Edge Pre " + node.data + "--" + child.data);
			traverse(child);
			System.out.println("Edge Post " + node.data + "--" + child.data);
		}

		System.out.println("Node Post " + node.data);
	}

	public static void levelOrder(TreeNode node)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);

		while ( !queue.isEmpty() )
		{
			TreeNode curr = queue.poll();
			System.out.print(curr.data + " ");

			for (TreeNode child : curr.children)
			{
				queue.add(child);
			}
		}
	}

	public static void levelOrderLineWise(TreeNode node)
	{
		Queue<TreeNode> mainQueue = new LinkedList<>();
		Queue<TreeNode> childQueue = new LinkedList<>();
		mainQueue.add(node);

		while ( !mainQueue.isEmpty() )
		{
			TreeNode curr = mainQueue.poll();
			System.out.print(curr.data + " ");

			for (TreeNode child : curr.children)
			{
				childQueue.add(child);
			}

			if ( mainQueue.isEmpty() )
			{
				System.out.println();
				mainQueue = childQueue;
				childQueue = new LinkedList<>();
			}
		}
	}

	public static void levelOrderLinewiseZigZag(TreeNode node)
	{
		Stack<TreeNode> mainStack = new Stack<>();
		Stack<TreeNode> childStack = new Stack<>();
		mainStack.push(node);

		int level = 1;
		
		while ( !mainStack.isEmpty() )
		{
			TreeNode curr = mainStack.pop();
			System.out.print(curr.data + " ");

			if ( level % 2 == 1 )
			{
				for (TreeNode child : curr.children)
				{
					childStack.push(child);
				}
			} 
			else
			{
				for (int i = curr.children.size() - 1; i >= 0; i--)
				{
					childStack.push(curr.children.get(i));
				}
			}

			if ( mainStack.isEmpty() )
			{
				System.out.println();
				mainStack = childStack;
				childStack = new Stack<>();
				level++;
			}
		}
	}
}
