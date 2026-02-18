package com.jai.genericTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreTreesSimilarInShapeTest
{

    @Test
    void testBothNull()
    {
        assertTrue(AreTreesSimilarInShape.areSimilarInShape(null, null));
    }

    @Test
    void testOneNull()
    {
        TreeNode node = new TreeNode(1);
        assertFalse(AreTreesSimilarInShape.areSimilarInShape(node, null));
        assertFalse(AreTreesSimilarInShape.areSimilarInShape(null, node));
    }

    @Test
    void testDifferentChildCount()
    {
        TreeNode root1 = new TreeNode(1);
        TreeNode child1 = new TreeNode(2);
        root1.addChild(child1);

        TreeNode root2 = new TreeNode(10);

        assertFalse(AreTreesSimilarInShape.areSimilarInShape(root1, root2));
    }

    @Test
    void testSameShapeDifferentData()
    {
        TreeNode r1 = new TreeNode(1);
        TreeNode r1c1 = new TreeNode(2);
        TreeNode r1c2 = new TreeNode(3);
        r1.addChild(r1c1);
        r1.addChild(r1c2);

        TreeNode r2 = new TreeNode(10);
        TreeNode r2c1 = new TreeNode(20);
        TreeNode r2c2 = new TreeNode(30);
        r2.addChild(r2c1);
        r2.addChild(r2c2);

        assertTrue(AreTreesSimilarInShape.areSimilarInShape(r1, r2));
    }

    @Test
    void testDifferentStructureDeep()
    {
        TreeNode a = new TreeNode(1);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(3);
        a.addChild(a1);
        a1.addChild(a2);

        TreeNode b = new TreeNode(10);
        TreeNode b1 = new TreeNode(20);
        b.addChild(b1);

        assertFalse(AreTreesSimilarInShape.areSimilarInShape(a, b));
    }
}
