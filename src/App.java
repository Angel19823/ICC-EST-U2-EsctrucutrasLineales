
import Materia.Controller.MenuController;
import Materia.Stacks.Stacks;

public class App {
    public static void main(String[] args) throws Exception {
        //runStack();
        runContactMannager();
        System.out.println("Profe no se porque no se corre");
    }
    public static void runStack(){
        
        Stacks stack = new Stacks();

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printStack();
        System.out.println("Tamano: "+stack.getSize());

        System.out.println("Cima: "+stack.peek());
        System.out.println("Retirar: "+stack.pop());
        System.out.println("Cima: "+stack.peek());
        System.out.println("Retirar: "+stack.pop());
        System.out.println("Cima: "+stack.peek());


    }

    public static void runContactMannager(){
        MenuController menucontroller = new MenuController();
        menucontroller.showMenu();
    }
}
