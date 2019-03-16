package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Integer expected = 8;
        Assert.assertEquals(expected, linkedList.get(0));


    }

    @Test
    public void removeTest() {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);
        Integer length = linkedList.size();
        Integer expected = length-1;
        linkedList.remove(1);
        Integer actual = linkedList.size();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Boolean bool = linkedList.contains(2);
        Assert.assertTrue(bool);

    }

    @Test
    public void findTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Integer actual = linkedList.find(2);
        Integer expected = 3;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest() {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Integer actual = linkedList.size();
        Integer expected = 4;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest() {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Integer actual = linkedList.get(2);
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyTest() {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        SinglyLinkedList actual = linkedList.copy(linkedList);

       Assert.assertEquals(linkedList.get(0), actual.get(3));
        Assert.assertEquals(linkedList.get(1), actual.get(2));
        Assert.assertEquals(linkedList.get(2), actual.get(1));
        Assert.assertEquals(linkedList.get(3), actual.get(0));

    }

    @Test
    public void sortTest() {

        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(9);
        linkedList.add(8);

        Integer actual1 = 1;
        Integer actual2 = 2;
        Integer actual3 = 8;
        Integer actual4 = 9;


        linkedList.sort();
        Assert.assertEquals(linkedList.get(0), actual1);
       Assert.assertEquals(linkedList.get(1), actual2);
       Assert.assertEquals(linkedList.get(2), actual3);
        Assert.assertEquals(linkedList.get(3), actual4);

    }


}
