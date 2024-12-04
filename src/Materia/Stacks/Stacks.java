package Materia.Stacks;

import java.util.EmptyStackException;

import Materia.Modelo.Nodo;

public class Stacks {
    private Nodo top;

    public Stacks() {
        this.top = null;
    
    }

    public void push(int value){
        Nodo newNode = new Nodo(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
       Nodo current = top;
       while(current != null){
        System.out.println(current.getValue());
        current = current.getNext();
       }
    }

    public int getSize(){
        Nodo current = top;
        int cont = 0;
       while(current != null){
        System.out.println(current.getValue());
        current = current.getNext();
        cont++;
       }
       return cont;
    }
}
