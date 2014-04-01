package com.bharat.ds;

import org.junit.Test;

/**
 * Created by kondetib on 12/18/13.
 */
public class TreeNodeTest {

    @Test
    public void testPrintPreorderWithSingleNode() throws Exception {
        TreeNode<Integer> treeNode = new TreeNode<Integer>(5);
        TreeNode.getPreOrder(treeNode);
    }

    @Test
    public void testPrintPreorderWith1Level() throws Exception {
        TreeNode<Integer> left = new TreeNode<Integer>(4);
        TreeNode<Integer> right = new TreeNode<Integer>(6);
        TreeNode<Integer> root = new TreeNode<Integer>(5,left,right);

        TreeNode.getPreOrder(root);
    }
}
