package com.TrX;

public class SinglyLLTest {

    public static void main(String[] args) {

        SinglyLinkedList Sll1 = new SinglyLinkedList();
        Sll1.CreateSinglyLinkedList(10);
        Sll1.InsertInLinkedList(20,1);
        Sll1.InsertInLinkedList(30,2);
        Sll1.InsertInLinkedList(40,3);
        Sll1.Traverse();
        Sll1.Search(40);
        Sll1.Delete(3);
        Sll1.Traverse();
        Sll1.DeleteLinkedList();
    }

}
