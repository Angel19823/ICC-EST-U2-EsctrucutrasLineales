
import Materia.Stacks.Stacks;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
    }
    public static void runStack(){
        
        Stacks stack = new Stacks();

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

       // System.out.println("Lista: "+stack.printStack());
        System.out.println("Tamano: "+stack.getSize());

        System.out.println("Cima: "+stack.peek());
        System.out.println("Retirar: "+stack.pop());
        System.out.println("Cima: "+stack.peek());
        System.out.println("Retirar: "+stack.pop());
        System.out.println("Cima: "+stack.peek());


    }
}
