package com.jai.genericTree;

import java.util.ArrayList;
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
		TreeNode root;
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

	}
}
