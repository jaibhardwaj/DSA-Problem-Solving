package com.jai.genericTree;

import java.util.Collections;

public class MirrorGenericTree 
{
    public static void mirror(TreeNode node)
    {
        for (TreeNode child : node.children)
        {
            mirror(child);
        }

        Collections.reverse(node.children);
        
        /*
        int left = 0;
        int right = node.children.size() - 1;

        while (left < right)
        {
            TreeNode temp = node.children.get(left);
            node.children.set(left, node.children.get(right));
            node.children.set(right, temp);

            left++;
            right--;
        }
        */
    }
}
