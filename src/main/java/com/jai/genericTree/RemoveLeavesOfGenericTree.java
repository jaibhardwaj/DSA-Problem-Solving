package com.jai.genericTree;

public class RemoveLeavesOfGenericTree 
{
    public static void removeLeaves(TreeNode node) 
    {
        if (node == null) 
        {
            return;
        }

        // Iterate through the children in reverse order to safely remove leaves
        for (int i = node.children.size() - 1; i >= 0; i--) 
        {
            TreeNode child = node.children.get(i);
            if (child.children.isEmpty()) 
            {
                // Remove leaf node
                node.children.remove(i);
            } 
    
        }

        // Recur for remaining children
        for (TreeNode child : node.children) 
        {
            removeLeaves(child);   
        }
    }
}
