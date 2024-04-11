package com.learning.core.day4session1.D03P09;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList5 {
    private Node front, rear;

    public QueueUsingLinkedList5() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedElement = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return removedElement;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList5 queue = new QueueUsingLinkedList5();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}