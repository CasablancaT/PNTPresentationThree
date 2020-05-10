package Set;

import java.util.HashSet;

public class SetCityTwo {

    public static void main(String[] args) {

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Set 1 : " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Another set : " + oddNumbers);

        //difference between hashset1  and hashset 2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference :  " + primeNumbers);
    }
}
