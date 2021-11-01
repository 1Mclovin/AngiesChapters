package arraysandcollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsAndMaps {
    public static void main(String[] args) {

        //lets create a hash set and a tree set

        Set<Integer> primeNumbersHashSet = new HashSet<>();
        Set<Integer> primeNumbersTreeSet = new TreeSet<>();

        primeNumbersHashSet.add(71);
        primeNumbersHashSet.add(61);
        primeNumbersHashSet.add(41);
        primeNumbersHashSet.add(1);

        primeNumbersTreeSet.add(71);
        primeNumbersTreeSet.add(61);
        primeNumbersTreeSet.add(41);
        primeNumbersTreeSet.add(1);

        //this will print out everything inside of the hashset
        primeNumbersHashSet.forEach(System.out::println);
        System.out.println("");
        primeNumbersTreeSet.forEach(System.out::println);

        // the tree set orders elements in the way you entered them






    }
}
