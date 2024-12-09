package Materia.Controller;

import Materia.Modelo.Contact;
import Materia.View.ConsoleView;

public class MenuController {
    private ContactManager contactManage;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManage = contactManage;
        this.consoleView = consoleView;
    }

    public void showMenu(){
        boolean exit = false;
    while(exit){
        consoleView.displayMenu();
        String option = consoleView.getInput("");
        switch (option) {
            case "1":
                addContact();
                break;
            case "2":
                findContact();
                break;
            case "3":
                deleteContact();
                break;
            case "4":
                printList();
                break;
            case "5":
                exit = true;
                consoleView.showMessage();
                break;
        
            default:
                consoleView.showMessage();
                break;
            }
        }
    }
    public void addContact(){
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManage.addContact(contact);
        consoleView.showMessage();   
    }
    public void findContact(){

    }
    public void deleteContact(){

    }
    public void printList(){

    }

    
}