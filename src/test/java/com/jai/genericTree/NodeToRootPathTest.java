package com.jai.genericTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeToRootPathTest
{

    @Test
    void testFindElementInRoot()
    {
        TreeNode root = new TreeNode(10);
        List<Integer> path = NodeToRootPath.findElement(root, 10);
        
        assertEquals(1, path.size());
        assertEquals(10, path.getFirst());
    }

    @Test
    void testFindElementInChild()
    {
        TreeNode root = new TreeNode(10);
        TreeNode child1 = new TreeNode(20);
        TreeNode child2 = new TreeNode(30);
        root.addChild(child1);
        root.addChild(child2);
        
        List<Integer> path = NodeToRootPath.findElement(root, 20);
        
        // Path should be [20, 10]
        assertEquals(2, path.size());
        assertEquals(20, path.get(0));
        assertEquals(10, path.get(1));
    }

    @Test
    void testFindElementDeepInTree()
    {
        // Tree structure:
        //      10
        //    /    \
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
        
        List<Integer> path = NodeToRootPath.findElement(root, 50);
        
        // Path should be [50, 20, 10]
        assertEquals(3, path.size());
        assertEquals(50, path.get(0));
        assertEquals(20, path.get(1));
        assertEquals(10, path.get(2));
    }

    @Test
    void testElementNotFound()
    {
        TreeNode root = new TreeNode(10);
        TreeNode child1 = new TreeNode(20);
        root.addChild(child1);
        
        List<Integer> path = NodeToRootPath.findElement(root, 100);
        
        assertTrue(path.isEmpty());
    }

    @Test
    void testEmptyTree()
    {
        List<Integer> path = NodeToRootPath.findElement(null, 10);
        assertTrue(path.isEmpty());
    }
}
