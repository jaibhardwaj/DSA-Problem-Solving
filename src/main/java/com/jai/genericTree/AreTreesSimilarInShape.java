package com.jai.genericTree;

public class AreTreesSimilarInShape 
{
    public static boolean areSimilarInShape(TreeNode root1, TreeNode root2) 
    {
        if (root1 == null && root2 == null) 
        {
            return true;
        }

        if (root1 == null || root2 == null)
        {
            return false;
        }

        if (root1.children.size() != root2.children.size()) 
        {
            return false;
        }
        for (int i = 0; i < root1.children.size(); i++)     
        {
            if (!areSimilarInShape(root1.children.get(i), root2.children.get(i))) 
            {
                return false;
            }
        }
        return true;
    }
}
