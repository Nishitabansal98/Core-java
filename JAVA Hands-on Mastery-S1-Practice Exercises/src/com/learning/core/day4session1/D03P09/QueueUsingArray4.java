package com.learning.core.day4session1.D03P09;

 public class QueueUsingArray4 {
    private static final int MAX_SIZE = 100;
    private int[] queueArray;
    private int front;
    private int rear;

    public QueueUsingArray4() {
        queueArray = new int[MAX_SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queueArray[rear] = data;
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedElement = queueArray[front];
        front++;
        return removedElement;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray4 queue = new QueueUsingArray4();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();
        queue.display();
    }
}