package com.company;

public class linkedListsQueue<Item> {

    private Node<Item> head;
    private Node<Item> tail;
    private int len=0;

    public void enqueue(Item item){
        Node<Item> tail = new Node<>();
        Node<Item> old = new Node<>();

        tail.data = item;
        tail.next = null;

        if(isEmpty()){
            old.next = tail;
        }else{
            head = tail;
        }
        len++;
    }

    public Item dequeue(){
        Item item = head.data;
        head = head.next;
        if(isEmpty()){
            tail = null;
        }

        len--;
        return item;
    }

    public boolean isEmpty(){
        return len != 0;
    }

    public int size(){
        return len;
    }


}
