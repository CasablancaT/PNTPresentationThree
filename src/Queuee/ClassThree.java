package Queuee;

import java.util.ArrayDeque;

public class ClassThree {

    public static void main(String[] args) {
        ArrayDeque <String> stack = new ArrayDeque<>();

        // add elements to the stack
        stack.push("Dog");
        stack.push("Cat");
        stack.push("Horse");
        System.out.println("Stack : " + stack);

        //Access elment from the top of the stack
        String element = stack.peek();
        System.out.println("Accessed element : " + element);

        //Remove hhe element from the top of the stack
        String removeElement = stack.pop();
        System.out.println("Removed element : " + removeElement);
    }
}
