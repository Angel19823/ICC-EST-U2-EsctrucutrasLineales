package Materia.Modelo;

public class Nodo {
    int value;
    Nodo next;
    public Nodo(int value) {
        this.value = value;
        this.next = null;
    }
    @Override
    public String toString() {
        return value + " " + next;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

    
}
