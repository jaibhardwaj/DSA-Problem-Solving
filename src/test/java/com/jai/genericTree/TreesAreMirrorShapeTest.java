package com.jai.genericTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreesAreMirrorShapeTest
{

    @Test
    public void testBothNull()
    {
        assertTrue(TreesAreMirrorShape.areMirrorShape(null, null));
    }

    @Test
    public void testSimpleMirror()
    {
        TreeNode a = new TreeNode(1);
        a.addChild(new TreeNode(2));
        a.addChild(new TreeNode(3));

        TreeNode b = new TreeNode(10);
        b.addChild(new TreeNode(3));
        b.addChild(new TreeNode(2));

        assertTrue(TreesAreMirrorShape.areMirrorShape(a, b));
    }

    @Test
    public void testNotMirror()
    {
        TreeNode a = new TreeNode(1);
        a.addChild(new TreeNode(2));
        a.addChild(new TreeNode(3));

        TreeNode b = new TreeNode(10);
        b.addChild(new TreeNode(2));
        b.addChild(new TreeNode(3));

        assertTrue(TreesAreMirrorShape.areMirrorShape(a, b));
    }

    @Test
    public void testDeepMirror()
    {
        TreeNode a = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        a.addChild(a2);
        a.addChild(a3);
        a2.addChild(new TreeNode(4));
        a2.addChild(new TreeNode(5));

        TreeNode b = new TreeNode(10);
        TreeNode b2 = new TreeNode(20);
        TreeNode b3 = new TreeNode(30);
        b.addChild(b3);
        b.addChild(b2);
        b2.addChild(new TreeNode(5));
        b2.addChild(new TreeNode(4));

        assertTrue(TreesAreMirrorShape.areMirrorShape(a, b));
    }
}
