package com.zipcodewilmington.singlylinkedlist;

import java.sql.SQLOutput;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList <Integer>();

        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        linkedList.Print(linkedList.getHead());
        //linkedList.remove(1);
        //Boolean bool = linkedList.contains(9);
        //System.out.println(bool);
        //linkedList.removeByElement("b");

        //Integer result = linkedList.find("o");
        //System.out.println("The index of the element to be found is: " + result);
        //System.out.println(" The updated Linked List");
        //linkedList.Print(linkedList.getHead());


        //System.out.println("the size of the Linked List " + linkedList.size());

       // System.out.println("The element at index is " + linkedList.find("b"));

        System.out.println("The copied array is ");
        SinglyLinkedList<String> sl= linkedList.copy(linkedList);
        linkedList.Print(linkedList.getHead());
       //linkedList.Print(sl.getHead());
        //System.out.println();
        //System.out.println("The sorted array");
        //linkedList.sort();
        //linkedList.Print(linkedList.getHead());

    }

    }


