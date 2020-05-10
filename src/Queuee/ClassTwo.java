package Queuee;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ClassTwo {

    public static void main(String[] args) {
        ArrayDeque <String> animals = new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Horse");
        System.out.println("Animals in arry deque is : " + animals);

        //Using iterator()
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

        //Iterate backwards

        Iterator<String> iterator1 = animals.descendingIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next());
            System.out.print(",");
        }

        // Using remove ()
       // String elements = animals.remove();
       // System.out.println("Removed element : " + elements);
        System.out.println("New array deque : " + animals);

        //Using removeFirst()
        String firstElement = animals.removeFirst();
        System.out.println("Removed first element : " + firstElement);

        String lastElement = animals.removeLast();
        System.out.println("Remvoed last element: " + lastElement);

        System.out.println(animals);
    }
}
