package com.company;

public class stackArray<Item> {

    private int len;
    private Node<Item> top = null;

    @SuppressWarnings("unchecked")
    private Item[] q = (Item[]) new Object[1];


    @SuppressWarnings("unchecked")
    public void resize(int capacity){
        Item[] copy = (Item[]) new Object[capacity];
        for(int i = 0; i < len; i++){
            copy[i] = q[i];
        }
        q = copy;
    }

    public void push(Item item){
    // first check if its full
        if(len == q.length){
            resize(2 * q.length); // if full resize
        }
        q[len++] = item; // if not full increment top index and add data top top of stax
        // increment length of stack
    }

    public Item pop(){
        if(!isEmpty()){
            Item item = q[len-1]; // decrement top of stack
            len--;
            return item;
        }
        throw new IndexOutOfBoundsException("Stack is empty");
    }


    private boolean isEmpty(){
        return len == 0;
    }


    int size(){
        return len;
    }
}
