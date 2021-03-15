package com.company;

import java.util.Iterator;

public class doublyLinkedList<Item> implements Iterable<Item> {
    private Node<Item> head; //first node
    private Node<Item> tail; //last node
    private int len = 0;//length

    public void addToFront(Item item){
        Node<Item> node = new Node<Item>();
        node.data = item;
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;
        len++;
    }

    public void removeFromFront(){
        if(head == null){
            throw new IndexOutOfBoundsException("The list is empty");
        }
        head = head.next;
        len--;
    }

    public void addToRear(Item item){
        Node<Item> node = new Node<Item>();
        node.data = item;
        node.next = null;
        tail = node;

        if(head == null){
            head = node;
        }else{
            Node<Item> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
            node.previous = current;
        }

        len++;

    }

    public void removeFromRear(){
        if(head == null){
            throw new IndexOutOfBoundsException("The list is empty!");
        }else{
            if(head != tail){
                tail = tail.previous;
                tail.next = null;
            }else {
                head = tail = null;
            }
        }
        len--;
    }


    public int count(){
        return len;
    }

    private class doublyLinkedListIterator implements Iterator<Item>{
        Node<Item> current = head;
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            Item item = current.data;
            current = current.next;
            return item;
        }
    }
    public Iterator<Item> iterator(){
        return new doublyLinkedListIterator();
    }
}