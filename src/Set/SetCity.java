package Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetCity {

    public static void main(String[] args) {

        HashSet <Integer> evenNumber = new HashSet<>();

        //Using add method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Hashset : " + evenNumber );

        HashSet<Integer> numbers = new HashSet<>();

        //Using add all method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("Hashset: " + numbers);

        //calling iteratir methid
        Iterator<Integer> iterator = evenNumber.iterator();
        System.out.println("Hashset using iterator: ");

        //Accessing elements
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

    }
}
