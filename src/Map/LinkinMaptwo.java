package Map;

import java.util.LinkedHashMap;

public class LinkinMaptwo {

    public static void main(String[] args) {
        LinkedHashMap <String , Integer> numbers = new LinkedHashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println("map : " + numbers);

        //using entryset
        System.out.println("Key value pairs : " + numbers.entrySet());

        //using keyset
        System.out.println("Keys only : " + numbers.keySet());

        //using values
        System.out.println("values only : " + numbers.values());

        //using get
        int value1 = numbers.get("three");
        System.out.println("Returned value is : " + value1);

        //using getordefault

         int value2 = numbers.getOrDefault("five", 5);
        System.out.println("Returned number : " + value2);


        // remove method with single parameter

        int value3 = numbers.remove("two");
        System.out.println("removed value is : " + value3);

        // remove method with 2 parmeters

        boolean result = numbers.remove("three", 3);
        System.out.println("Did we really remove three from map bro ? " + result);
    }
}
