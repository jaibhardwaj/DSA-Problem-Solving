package com.jai.genericTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceBetweenNodesTest 
{

    @Test
    void testDistanceBetweenSiblings() 
    {
        // Tree:
        //      10
        //    /    
        //   20    30
        //  /  \
        // 40  50
        TreeNode root = new TreeNode(10);
        TreeNode child1 = new TreeNode(20);
        TreeNode child2 = new TreeNode(30);
        root.addChild(child1);
        root.addChild(child2);

        TreeNode grandChild1 = new TreeNode(40);
        TreeNode grandChild2 = new TreeNode(50);
        child1.addChild(grandChild1);
        child1.addChild(grandChild2);

        // distance between 40 and 50 is 2 (40->20->50)
        assertEquals(2, DistanceBetweenNodes.distanceBetweenNodes(root, 40, 50));
    }

    @Test
    void testDistanceBetweenDifferentBranches() 
    {
        TreeNode root = new TreeNode(10);
        TreeNode child1 = new TreeNode(20);
        TreeNode child2 = new TreeNode(30);
        root.addChild(child1);
        root.addChild(child2);

        TreeNode grandChild1 = new TreeNode(40);
        child1.addChild(grandChild1);

        // distance between 40 and 30 is 3 (40->20->10->30)
        assertEquals(3, DistanceBetweenNodes.distanceBetweenNodes(root, 40, 30));
    }

    @Test
    void testDistanceSameNode() 
    {
        TreeNode root = new TreeNode(10);
        TreeNode child = new TreeNode(20);
        root.addChild(child);

        assertEquals(0, DistanceBetweenNodes.distanceBetweenNodes(root, 20, 20));
    }

    @Test
    void testNodeNotFound() 
    {
        TreeNode root = new TreeNode(10);
        TreeNode child = new TreeNode(20);
        root.addChild(child);

        // one node not present
        assertEquals(-1, DistanceBetweenNodes.distanceBetweenNodes(root, 20, 999));
    }
}
