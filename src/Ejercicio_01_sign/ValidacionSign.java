package Ejercicio_01_sign;

import Materia.Stacks.StackGeneric;

public class ValidacionSign {
    public static boolean esValido(String i) {
        StackGeneric<Character> stack = new StackGeneric<>();
        for (char j : i.toCharArray()) {
            if (j == '(' || j == '[' || j == '{') {
                stack.push(j);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }   
                char top = stack.pop();
                if ((j == ')' && top != '(') || 
                    (j == ']' && top != '[') || 
                    (j == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}