package com.jai.genericTree;

public class TreeHeight
{
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
}
