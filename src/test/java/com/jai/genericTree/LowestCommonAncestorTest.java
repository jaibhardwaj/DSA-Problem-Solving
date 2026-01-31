package com.jai.genericTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LowestCommonAncestorTest
{

    @Test
    void testLCAInSimpleTree()
    {
        // Tree structure:
        //      10
        //    /    \
        //   20    30
        //  /  \
        // 40  50
        
        TreeNode root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        root.addChild(node20);
        root.addChild(node30);
        
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
        node20.addChild(node40);
        node20.addChild(node50);
        
        // LCA of 40 and 50 should be 20
        assertEquals(20, LowestCommonAncestor.lowestCommonAncestor(root, 40, 50));
    }

    @Test
    void testLCAWithRootAsAncestor()
    {
        // Tree structure:
        //      10
        //    /    \
        //   20    30
        //  /
        // 40
        
        TreeNode root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        root.addChild(node20);
        root.addChild(node30);
        
        TreeNode node40 = new TreeNode(40);
        node20.addChild(node40);
        
        // LCA of 40 and 30 should be 10 (root)
        assertEquals(10, LowestCommonAncestor.lowestCommonAncestor(root, 40, 30));
    }

    @Test
    void testLCAWhereOneNodeIsAncestorOfOther()
    {
        // Tree structure:
        //      10
        //     /
        //    20
        //   /
        //  40
        
        TreeNode root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        root.addChild(node20);
        
        TreeNode node40 = new TreeNode(40);
        node20.addChild(node40);
        
        // LCA of 20 and 40 should be 20
        assertEquals(20, LowestCommonAncestor.lowestCommonAncestor(root, 20, 40));
    }

    @Test
    void testLCAWithSameNode()
    {
        TreeNode root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        root.addChild(node20);
        
        // LCA of 20 and 20 should be 20
        assertEquals(20, LowestCommonAncestor.lowestCommonAncestor(root, 20, 20));
    }

    @Test
    void testLCAWithRootAndChild()
    {
        TreeNode root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        root.addChild(node20);
        
        // LCA of 10 and 20 should be 10
        assertEquals(10, LowestCommonAncestor.lowestCommonAncestor(root, 10, 20));
    }
}
