package Materia.Queues;

import java.util.NoSuchElementException;

import Materia.Modelo.Nodo;

public class Queue {
    
    private Nodo front;
    private Nodo rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int value) {
        Nodo newNode = new Nodo(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    public Nodo dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        Nodo node = front;
        front =front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }
    public Nodo peek(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return front;

    }
    public int size() {
        int size = 0;
        Nodo current = front;
        while(current!=null){
            size++;
            current = current.getNext();
        }
        return size;
    }
    public void printQueue() {
        Nodo current = front;
        while(current!=null){
            System.out.print(current.getValue());
            current = current.getNext();
        }
    }
    public boolean isEmpty() {
        return front == null;
    }
}