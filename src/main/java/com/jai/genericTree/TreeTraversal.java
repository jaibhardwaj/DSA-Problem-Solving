package com.jai.genericTree;

public class TreeTraversal
{
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
}
