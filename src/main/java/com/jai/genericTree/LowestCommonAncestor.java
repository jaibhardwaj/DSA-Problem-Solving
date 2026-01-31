package com.jai.genericTree;

import java.util.List;

public class LowestCommonAncestor
{

    public static int lowestCommonAncestor(TreeNode root, int d1, int d2)
    {
        List<Integer> p1 = NodeToRootPath.findElement(root, d1);
        List<Integer> p2 = NodeToRootPath.findElement(root, d2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while (i >= 0 && j >= 0 && p1.get(i).equals(p2.get(j)))
        {
            i--;
            j--;
        }

        return p1.get(i + 1);
    }

}
