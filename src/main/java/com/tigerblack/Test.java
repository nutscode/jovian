package com.tigerblack;
public class Test {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> lit = new DoublyLinkedList();
        lit.append(10);
        lit.append(11);
        lit.append(12);
        lit.append(13);

        lit.prepend(9);
        lit.prepend(8);
        lit.prepend(7);
        lit.prepend(6);
        System.out.println("size is " + lit.size());
        lit.iterate();
        System.out.println("Head is " + lit.head());
        System.out.println("Tail is " + lit.tail());



 
    }

}
