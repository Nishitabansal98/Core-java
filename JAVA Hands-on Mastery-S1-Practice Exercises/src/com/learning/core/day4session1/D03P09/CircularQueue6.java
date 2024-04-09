package com.learning.core.day4session1.D03P09;
public class CircularQueue6 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public CircularQueue6(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = data;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int removedElement = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedElement;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in CircularQueue: ");
        int count = 0;
        int i = front;
        while (count < currentSize) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public static void main(String[] args) {
        CircularQueue6 queue = new CircularQueue6(5);
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}