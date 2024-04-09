package com.learning.core.day4session1.D03P09;

public class Stack1 {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack1(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
        }
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        } else {
            String poppedElement = stackArray[top];
            top--;
            return poppedElement;
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        stack.push("4");
        stack.push("hello");
        stack.push("world");
        stack.push("java");
        stack.push("programming");

        System.out.println("After pushing 4 elements:");
        stack.display();

        System.out.println("After pop:");
        stack.pop();
        stack.pop();
        stack.display();
    }
}