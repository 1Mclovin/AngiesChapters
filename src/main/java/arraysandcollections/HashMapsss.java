package arraysandcollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapsss {
    public static void main(String[] args) {

        //all the ways we can declare a hashMap are below

        HashMap countries = new HashMap();
        HashMap<Integer,String> countries2 = new HashMap<>();
        Map languages = new HashMap();
        Map<String,String> languages2 = new HashMap<>();

        countries2.put(900,"Mexico");
        countries2.put(450,"Canada");
        countries2.put(320,"United States");

        System.out.println(countries2.get(900));


        // hashMaps allow for null keywords
        //tree maps absolutely do not

    }
}
