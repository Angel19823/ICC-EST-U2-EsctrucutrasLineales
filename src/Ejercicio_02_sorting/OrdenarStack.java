
package Ejercicio_02_sorting;
import Materia.Stacks.StackGeneric;

public class OrdenarStack {
    public static void ordenar(StackGeneric<Integer> stack) {
        StackGeneric<Integer> stackAuxiliar = new StackGeneric<>();
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!stackAuxiliar.isEmpty() && stackAuxiliar.peek() > temp) {
                stack.push(stackAuxiliar.pop());
            }
            stackAuxiliar.push(temp);
        }
        
        while (!stackAuxiliar.isEmpty()) {
            stack.push(stackAuxiliar.pop());
        }
    }
}