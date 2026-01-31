package com.jai.genericTree;

public class FindElementInGenericTree 
{
    
    public static boolean findElement(TreeNode root, int target) 
    {
        if (root.data == target) 
        {
            return true;
        }

        for (TreeNode child : root.children) 
        { 
            boolean res = findElement(child, target);
            if (res)
            {
                return true;
            }
        }

        return false;
    }

}
