package com.jai.genericTree;

import java.util.ArrayList;
import java.util.List;

public class NodeToRootPath 
{
    public static List<Integer> findElement(TreeNode root, int data) 
    {
        if(root == null) 
        {
            return new ArrayList<>();
        }

        // If the current node matches the data, return a list with this node's data
        if(root.data == data) 
        {
            List<Integer> path = new ArrayList<>();
            path.add(root.data);
            return path;
        }

        // Recursively search in the children of the current node
        for(TreeNode child : root.children) 
        {
            List<Integer> pathFromChild = findElement(child, data);
            if(!pathFromChild.isEmpty()) 
            {
                pathFromChild.add(root.data);
                return pathFromChild;
            }
        }
        
        return new ArrayList<>();
    }
}
