package com.jai.genericTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveLeavesOfGenericTreeTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {
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

    @Test
    public void testRemoveLeavesFromTree() {
        // initial size is 6
        assertEquals(6, TreeSize.size(root));

        RemoveLeavesOfGenericTree.removeLeaves(root);

        // After removing the original leaves (50,70,40) size should be 3
        assertEquals(3, TreeSize.size(root));

        // root should have two children (20 and 30) and both should now be leaves
        assertEquals(2, root.children.size());
        assertTrue(root.children.get(0).children.isEmpty());
        assertTrue(root.children.get(1).children.isEmpty());
    }

    @Test
    public void testRemoveLeavesSingleNode() {
        TreeNode single = new TreeNode(1);
        RemoveLeavesOfGenericTree.removeLeaves(single);
        // single node has no children and should remain
        assertEquals(1, TreeSize.size(single));
    }

    @Test
    public void testRemoveLeavesNull() {
        // should not throw
        assertDoesNotThrow(() -> RemoveLeavesOfGenericTree.removeLeaves(null));
    }
}
