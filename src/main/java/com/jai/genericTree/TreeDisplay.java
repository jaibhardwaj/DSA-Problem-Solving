package com.jai.genericTree;

public class TreeDisplay
{
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
}
