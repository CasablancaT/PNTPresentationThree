package Queuee;

import java.util.ArrayDeque;

public class Class {

    public static void main(String[] args) {


        ArrayDeque<String> animals = new ArrayDeque<>();

        //Using add()
      //  animals.add("dog");

        //Using add first method
       // animals.addFirst("cat");

        //using add last method
        //animals.addLast("horse");
       // System.out.println("Array deque : " + animals);

        //using offer
        animals.offer("Dog");

        //using offerfirst method
        animals.offerFirst("cat");

        //using the offerllast metehod
        animals.offerLast("horse");
        System.out.println("Array deque : " + animals);

        String firstElement = animals.getFirst();
        System.out.println("First element: " + firstElement);

        String lastElement = animals.getLast();
        System.out.println("Last element : " + lastElement );

        //using peek()
        String element = animals.peek();
        System.out.println("Head element : " + element);

        //using peekfirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First element : " + firstElement1);

        //using peeklast
        String lastElement1 = animals.peekLast();
        System.out.println("Last element : " + lastElement1);







    }
}