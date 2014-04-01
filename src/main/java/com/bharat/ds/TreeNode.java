package com.bharat.ds;

/**
 * Created by kondetib on 12/18/13.
 */
public class TreeNode<T> {
    T value;
    TreeNode left;
    TreeNode right;

    public TreeNode(T value) {
      this.value = value;
    }

    public TreeNode(T value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public static void getPreOrder(TreeNode root) {
        if(root==null) return;
        System.out.print(root.getValue() + " ");
        getPreOrder(root.getLeft());
        getPreOrder(root.getRight());
    }
}
