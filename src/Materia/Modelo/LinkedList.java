package Materia.Modelo;

public class LinkedList<T> {
    private NodeGeneric<T> head;
    private int size;

    public T findByValue(T value){
            return value;
    }

    public void deleteByVlue(T value){

    }

    public void print(){
        if(head == null){
            System.out.println("END");
            return;
        }
        NodeGeneric<T> current = head;
        while(current != null){
            System.out.print(current.getValue());
            if(current != null){
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println(" -> END");
    }

    public void appendToTail(T value){
        if(head == null){
            head = new NodeGeneric<>(value);
        }else{
            NodeGeneric<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new NodeGeneric<>(value));
        }
        size++;
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
