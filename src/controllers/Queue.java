package controllers;

import models.Node;

import java.util.EmptyStackException;

public class Queue {
    private Node primero;
    private Node ultimo;
    private int size;

    public Queue() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }

        size ++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }

        size --;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        Node aux = primero;
        System.out.print("Queue: ");
        while (aux != null) {
            System.out.print(aux.getValue() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("null");
    }
}
