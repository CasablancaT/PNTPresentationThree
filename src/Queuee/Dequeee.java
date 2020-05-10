package Queuee;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dequeee {

    public static void main(String[] args) {

        Deque<Integer> numbers = new ArrayDeque<>();

        //add elements to the Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque numbers : " + numbers);

        //Access elements of the Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First element :" + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last element : " + lastElement);

        //Remove elements from the Deque
        int removeNumberOne = numbers.pollFirst();
        System.out.println("Removed first element :" + removeNumberOne);

        int removeNumberTwo = numbers.pollLast();
        System.out.println("Removed last element :" + removeNumberTwo);

        System.out.println(numbers);
    }


}
