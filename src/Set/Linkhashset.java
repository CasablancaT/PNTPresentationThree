package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linkhashset {

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("Array list : " + evenNumbers);

        // create a linedkhashtset from arraylist

        LinkedHashSet <Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashset : " + numbers);
    }
}
