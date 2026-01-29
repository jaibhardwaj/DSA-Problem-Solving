package com.jai.genericTree;

public class LinearizeGenericTree 
{
    public static void linearize(TreeNode node) 
    {
        if (node == null) 
        {
            return;
        }

        for (TreeNode child : node.children) 
        {
            linearize(child);
        }

        while (node.children.size() > 1) 
        {
            TreeNode lastChild = node.children.remove(node.children.size() - 1);
            TreeNode secondLastChild = node.children.get(node.children.size() - 1);
            TreeNode tail = getTail(secondLastChild);
            tail.children.add(lastChild);
        }
    }

    private static TreeNode getTail(TreeNode node) 
    {
        while (node.children.size() == 1) 
        {
            node = node.children.get(0);
        }
        return node;
    }

    public static TreeNode linearize2(TreeNode node) 
    {
        if (node == null) 
        {
            return null;
        }

        if (node.children.isEmpty()) 
        {
            return node;
        }

        TreeNode lastTail = linearize2(node.children.get(node.children.size() - 1));

        while( node.children.size() > 1 ) 
        {
            TreeNode lastChild = node.children.remove(node.children.size() - 1);
            TreeNode secondLastChild = node.children.get(node.children.size() - 1);
            TreeNode secondLastTail = linearize2(secondLastChild);
            secondLastTail.children.add(lastChild);
        }

        return lastTail;
    }
}
