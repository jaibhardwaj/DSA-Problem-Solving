package com.jai.genericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeLevelOrder
{
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

	public static void levelOrderLineWise2(TreeNode node)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);

		while ( !queue.isEmpty() )
		{
			TreeNode curr = queue.poll();

			if ( curr == null )
			{
				System.out.println();
				if ( !queue.isEmpty() )
				{
					queue.add(null);
				}
			} 
			else
			{
				System.out.print(curr.data + " ");

				for (TreeNode child : curr.children)
				{
					queue.add(child);
				}
			}
		}
	}

	public static void levelOrderLineWise3(TreeNode node)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);

		while ( !queue.isEmpty() )
		{
			int size = queue.size();

			for (int i = 0; i < size; i++)
			{
				TreeNode curr = queue.poll();
				System.out.print(curr.data + " ");

				for (TreeNode child : curr.children)
				{
					queue.add(child);
				}
			}
			System.out.println();
		}
	}

	private static final class Pair
	{
		TreeNode node;
		int level;

		Pair(TreeNode node, int level)
		{
			this.node = node;
			this.level = level;
		}
	}

	public static void levelOrderLineWise4(TreeNode node)
	{
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(node, 1));

		int currLevel = 1;

		while ( !queue.isEmpty() )
		{
			Pair p = queue.poll();

			if ( p.level > currLevel )
			{
				currLevel = p.level;
				System.out.println();
			}

			System.out.print(p.node.data + " ");

			for (TreeNode child : p.node.children)
			{
				queue.add(new Pair(child, p.level + 1));
			}
		}
	}
}
