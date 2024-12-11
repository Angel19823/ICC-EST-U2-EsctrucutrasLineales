package Materia.Controller;

import Materia.Modelo.LinkedList;
import Materia.Modelo.NodeGeneric;
import Materia.Modelo.Contact;

public class ContactManager {
    private LinkedList<Contact<?, ? >> contacts;
    public ContactManager(){
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact){
        contacts.appendToTail(contact);
    }

    public void printList(){
        contacts.print();
    }

    public Contact<?, ?>findContactByName(String name){
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while(current != null){
            if(((String)current.getValue().getName()).equalsIgnoreCase(name)){
                return current.getValue();
            }
            current = current.getNext();	
        }
        return null;
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();

        if(current == null)
        return;
        
        if(((String)current.getValue().getName()).equalsIgnoreCase(name)){
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize(contacts.getSize()-1);
            return;
        }

        while(current.getNext() != null){
            if(((String) current.getValue().getName()).equalsIgnoreCase(name)){
                current.setNext(current.getNext().getNext());
                contacts.setSize(contacts.getSize()-1);
                return;
            }
            current = current.getNext();
        }
    }
}
