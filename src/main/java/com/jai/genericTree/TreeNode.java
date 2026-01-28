package com.jai.genericTree;

import java.util.ArrayList;

public class TreeNode
{
	public int data;
	public ArrayList<TreeNode> children = new ArrayList<>();

	public TreeNode(int data)
	{
		this.data = data;
	}

	public void addChild(TreeNode child)
	{
		children.add(child);
	}

	@Override
	public String toString()
	{
		return "TreeNode{" + "data=" + data + ", children=" + children + '}';
	}
}
