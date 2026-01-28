package com.jai.genericTree;

public class TreeMax
{
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
}
