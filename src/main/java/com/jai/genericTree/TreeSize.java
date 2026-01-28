package com.jai.genericTree;

public class TreeSize
{
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
}
