package Map;

import java.util.TreeMap;

public class ForestMap {

    public static void main(String[] args) {
        TreeMap<String,Integer> numbers= new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second" , 2);
        numbers.put("Three" ,3);
        System.out.println("Treemap : " + numbers);

        //Using the keyfirst method
        String firstKey= numbers.firstKey();
        System.out.println("First key: " + firstKey);

        //uusing the last key method
        String lastKey = numbers.lastKey();
        System.out.println("Last key :  " + lastKey);

        // using first entry method
        System.out.println("first entry : " + numbers.firstEntry());

        // using the last entry method
        System.out.println(" lsat entry : " +numbers.lastEntry());
    }
}
