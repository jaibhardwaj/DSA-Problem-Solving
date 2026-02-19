package com.jai.genericTree;

public class TreesAreMirrorShape 
{
    public static boolean areMirrorShape(TreeNode node1, TreeNode node2) 
    {
        if (node1 == null && node2 == null) 
        {
            return true;
        }
        if (node1 == null || node2 == null)
    {
            return false;
        }
        if (node1.children.size() != node2.children.size()) 
        {
            return false;
        }
        int n = node1.children.size();
        for (int i = 0; i < n; i++) 
        {
            TreeNode child1 = node1.children.get(i);
            TreeNode child2 = node2.children.get(n - 1 - i);
            if (!areMirrorShape(child1, child2)) 
            {
                return false;
            }
        }
        return true;
    }
}
