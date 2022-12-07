package com.TrX;

public class TreeImplementation {

    //InOrder Traversal
    public void inOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        inOrderTraversal(Root.Left);
        System.out.println(Root.data);
        inOrderTraversal(Root.Right);
    }
    //PreOrder Traversal
    public void preOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        System.out.println(Root.data);
        preOrderTraversal(Root.Left);
        preOrderTraversal(Root.Right);
    }
    //PostOrder Traversal
    public void postOrderTraversal(TreeNode Root){
        if(Root == null){
            return;
        }
        postOrderTraversal(Root.Left);
        postOrderTraversal(Root.Right);
        System.out.println(Root.data);
    }
    //Create a new Node
    public TreeNode CreateNode(int nodeValue){
        TreeNode node = new TreeNode();
        node.data = nodeValue;
        node.Left = null;
        node.Right = null;
        return node;
    }
    //Insert on left
    public TreeNode leftInsert(TreeNode Root,int nodeValue){
        Root.Left = CreateNode(nodeValue);
        return Root.Left;
    }
    //Insert on Right
    public TreeNode RightInsert(TreeNode Root,int nodeValue){
        Root.Right = CreateNode(nodeValue);
        return Root.Right;
    }

}
