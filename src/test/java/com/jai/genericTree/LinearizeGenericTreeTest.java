package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinearizeGenericTreeTest
{

    private TreeNode root;

    @BeforeEach
    public void setUp()
    {
        // Create test tree:
        //       10
        //    /  |  \
        //   20 30  40
        //   |  |
        //  50 70
        root = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        root.addChild(node20);
        root.addChild(node30);
        root.addChild(node40);
        node20.addChild(node50);
        node30.addChild(node70);
    }

    private int[] collectChain(TreeNode node)
    {
        List<Integer> seq = new ArrayList<>();
        if (node == null) return new int[0];
        seq.add(node.data);
        while (node.children.size() == 1)
        {
            node = node.children.get(0);
            seq.add(node.data);
        }
        int[] arr = new int[seq.size()];
        for (int i = 0; i < seq.size(); i++) arr[i] = seq.get(i);
        return arr;
    }

    @Test
    public void testLinearize()
    {
        assertEquals(6, TreeSize.size(root));

        LinearizeGenericTree.linearize(root);

        assertEquals(6, TreeSize.size(root));
        int[] expected = new int[]{10, 20, 50, 30, 70, 40};
        assertArrayEquals(expected, collectChain(root));
        assertEquals(1, root.children.size());
    }

    @Test
    public void testLinearize2()
    {
        assertEquals(6, TreeSize.size(root));

        TreeNode tail = LinearizeGenericTree.linearize2(root);

        // linearize2 returns last tail; ensure structure is linearized and sequence matches
        assertNotNull(tail);
        assertEquals(40, tail.data);
        int[] expected = new int[]{10, 20, 50, 30, 70, 40};
        assertArrayEquals(expected, collectChain(root));
    }

    @Test
    public void testLinearizeSingleNode()
    {
        TreeNode single = new TreeNode(1);
        LinearizeGenericTree.linearize(single);
        assertEquals(1, TreeSize.size(single));
        assertArrayEquals(new int[]{1}, collectChain(single));
    }

    @Test
    public void testLinearizeNull() 
    {
        assertDoesNotThrow(() -> LinearizeGenericTree.linearize(null));
        assertDoesNotThrow(() -> LinearizeGenericTree.linearize2(null));
    }
}
