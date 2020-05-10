package Map;

import java.util.LinkedHashMap;

public class LinkinMap {

    public static void main(String[] args) {
        //Create linkedhashmap of even numbers
        LinkedHashMap <String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("Map : " + evenNumbers);

        //Create a hashmap from the other hashmap
     //   LinkedHashMap <String, Integer> oddNumbers = new LinkedHashMap<>(evenNumbers);
       // oddNumbers.put("Three", 3);
        //System.out.println("Odd map : " + oddNumbers);

        evenNumbers.putIfAbsent("Six" , 6);
        System.out.println("Updated map : " + evenNumbers);

        //Creating a map of numbers
        LinkedHashMap <String, Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        //Using putall()
        numbers.putAll(evenNumbers);
        System.out.println("New linkedhashmap" + numbers);


    }
}
