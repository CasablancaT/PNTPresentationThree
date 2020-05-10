package Map;

import java.util.TreeMap;

public class ForestMapTwo {

    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 5);
        numbers.put("Third", 4);
        numbers.put("Fourth", 6);
        System.out.println("Treemap : " + numbers);

        //Using Higher method
        System.out.println("Using higher key(): " + numbers.higherKey("Fourth"));
        System.out.println("Using higher entry(): " + numbers.higherEntry("Fourth"));

        //Using lower method
        System.out.println("Using lower key (): " + numbers.lowerKey("Fourth"));
        System.out.println("Using lower entry(): " + numbers.lowerEntry("Fourth"));

        //Using ceiling method
        System.out.println("Using ceilingkey (): " + numbers.ceilingKey("Fourth"));
        System.out.println("Using ceilingentry(): " + numbers.ceilingEntry("Fourth"));

        //using floor method
        System.out.println("Using floorkey(): " + numbers.floorKey("Fourth"));
        System.out.println("Using floorentry(): " + numbers.floorEntry("Fourth"));


    }
}