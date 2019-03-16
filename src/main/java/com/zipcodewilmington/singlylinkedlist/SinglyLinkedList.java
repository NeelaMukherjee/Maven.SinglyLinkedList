package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private Integer listCount;

    public Integer getListCount() {
        return listCount;
    }

    public void setListCount(Integer listCount) {
        this.listCount = listCount;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    // Constructor
    public SinglyLinkedList() {

        // head = null;

        head = null;
        listCount = 0;
    }

    public SinglyLinkedList(Node node) {
        head = node;
    }

    //Inner class Node
    private class Node<T extends Comparable<T>> {
        private T element;
        private Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    //Adding element to Linked List
    public void add(T element) {
        //if (head == null) {
        head = new Node<T>(element, head);
//        } else {
//
//            Node<T> tmp = head;
//            while (tmp != null) {
//                tmp = tmp.next;
//            } tmp.next = new Node<T>(element, null);
//        }

    }


//        Node node = head;
//
//        while(node.getNext()!= null) {
//            node = node.getNext();
//        }
//            node.setNext(new Node<T>(element, node));


    //Removing element from linked List by passing the element
    public void removeByElement(T key) {
        if (head == null) throw new RuntimeException("cannot delete");

        if (head.element.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;

        while (current != null && !current.element.equals(key)) {
            //while (current != null) {
            previous = current;
            current = current.next;
        }

        if (current == null) throw new RuntimeException("cannot delete");

        //delete current node
        previous.next = current.next;

    }

    //Removing element by Index
    public Node remove(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return node;
    }

    //Contains

    public boolean contains(T key) {
        Node node = head;
        Boolean bool = false;
        while (node != null) {
            if (key.equals(node.element)) {
                bool = true;
            }
            node = node.next;
        }
        return bool;
    }

    //Find : returns the element's index if it is in the list, -1 otherwise

    public Integer find(T key) {

        Integer result = -1;
        Node node = head;
        Integer length = 0;

        if (contains(key)) {
            while (node != null) {
                if (key.equals(node.element)) {
                    result = length;
                }
                node = node.next;
                length++;
            }


        }

        return result;
    }

    // Size

    public Integer size() {
        Node node = head;
        Integer length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }

        return length;
    }
    //returns the element at the specified index

    public T get(Integer index) {
        Node node = head;
        // Integer length = size();

        for (int i = 0; i < index; i++) {
            node = node.next; //length++;
        }
        return (T) node.element;
    }

    //Copy

    public SinglyLinkedList copy(SinglyLinkedList sl) {
        SinglyLinkedList copiedList = new SinglyLinkedList(head);

        Node node = head;

        for (int i = 1; i < sl.size(); i++) {
            //copiedList.add(this.get(i));
            while (node != null) {
                copiedList.add(node.getElement());
                //System.out.println(node.getElement());
                node = node.next;
            }
        }

        return copiedList;
    }

    //Sorting the linked list, Using Bubble sort

    public void sort() {
        if (this.size() > 1) {
            for (int i = 0; i < this.size(); i++) {
                Node currNode = head;
                Node nextNode = head.next;
                for (int j = 0; j < this.size() - 1; j++) {
                    if ((currNode.element).compareTo(nextNode.element) > 0) {
                        T temp = (T) currNode.element;
                        currNode.setElement(nextNode.element);
                        nextNode.setElement(temp);
                    }
                    currNode = nextNode;
                    nextNode = nextNode.next;
                }
            }
        }
    }

    // Printing linked list
    void Print(Node head) {
        if (head == null) {
            return;
        }
        Node node = head;
        while (true) {
            System.out.println(node.element);
            if (node.next != null) {
                node = node.next;
            } else {
                break;
            }
        }


    }

}
