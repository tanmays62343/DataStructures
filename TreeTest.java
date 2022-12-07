package com.TrX;

public class TreeTest {

    public static void main(String[] args) {

        TreeImplementation T1 = new TreeImplementation();
        TreeNode node = T1.CreateNode(10);
        T1.leftInsert(node,7);
        T1.RightInsert(node,17);
        T1.leftInsert(node.Left,8);
        T1.RightInsert(node.Left,9);
        T1.leftInsert(node.Right,15);
        T1.RightInsert(node.Right,12);

        T1.inOrderTraversal(node);
        System.out.println();
        T1.preOrderTraversal(node);
        System.out.println();
        T1.postOrderTraversal(node);

    }

}
