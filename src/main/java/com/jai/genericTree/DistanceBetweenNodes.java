package com.jai.genericTree;

import java.util.List;

public class DistanceBetweenNodes 
{
    public static int distanceBetweenNodes(TreeNode root, int data1, int data2) 
    {
        // Find the paths from the root to both nodes
        List<Integer> pathToData1 = NodeToRootPath.findElement(root, data1);
        List<Integer> pathToData2 = NodeToRootPath.findElement(root, data2);

        // If either node is not found, return -1
        if (pathToData1.isEmpty() || pathToData2.isEmpty()) 
        {
            return -1;
        }

        int i = pathToData1.size() - 1;
        int j = pathToData2.size() - 1;

        // Find the lowest common ancestor (LCA) by comparing the paths
        while (i >= 0 && j >= 0 && pathToData1.get(i).equals(pathToData2.get(j))) 
        {            
            i--;
            j--;    
        }
        
        // Distance from data1 to LCA + distance from data2 to LCA
        return (i + 1) + (j + 1); 
    }
}
