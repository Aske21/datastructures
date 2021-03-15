package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----------");

        doublyLinkedList<Integer> list = new doublyLinkedList<Integer>();

        // doubly linked list test
        list.addToFront(2);
        list.removeFromFront();
        list.addToFront(3);
        list.addToRear(4);
        list.addToRear(5);


        list.removeFromFront();
        list.addToFront(6);
        list.removeFromFront();


       for(Integer i: list){
            System.out.println(i);
        }
        System.out.println("size:" + list.count());

        System.out.println("----------");


        // stack using array tests

        stackArray<Integer> stack = new stackArray<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());


        System.out.println("----------");

        linkedListsQueue<Integer> q = new linkedListsQueue<>();

        q.enqueue(5);
        q.enqueue(0);
        q.enqueue(5);
        System.out.println(q.dequeue());

        System.out.println(q.size() + " is the size");

    }
    }

