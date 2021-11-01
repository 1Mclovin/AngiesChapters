package chapter12;

import java.util.*;
import java.util.Set;

public class Lists {
    // a list can contain duplicate elements
    // some implementations of a list can be arraylist, linked list, stacked, and vector

    public static void main(String[] args) {

        // Set list
        Set<String> fruitSet = new HashSet();
        fruitSet.add("Guava");
        fruitSet.add("Mango");
        fruitSet.add("Pomegranted");



        List fruitList = new ArrayList();
        fruitList.add("apple");
        fruitList.add("Banana");
        fruitList.add("orange");


        //the order stays in the order that you added them
        System.out.println(fruitList);

        //you can print out whatever is stored at that certain index
        System.out.println(fruitList.get(2));


        // this is an example of a queue list
        Queue sweets = new LinkedList();
        sweets.add("donut");
        sweets.add("marsh mellow");
        sweets.add("chocolate");
        sweets.add("airhead");

        System.out.println(sweets.size());
        System.out.println(sweets);

        //we dont have to specify which item to remove it will automatically remove the first one
        sweets.remove();
        System.out.println(sweets);



        /// Now lets do a map
        // the map interface maps unique keys to values
        //you can access an element in a map by its key
        // the keys are required to be unique while the values are not
        // for example we can use the fruit name as the key and the calories as its value
        //you can also add objects here
        Map<String, Integer>fruitCalories = new HashMap();
        fruitCalories.put("apple", 90);
        fruitCalories.put("cherry",15);
        fruitCalories.put("pumpkin",200);
        fruitCalories.put("cantelope",160);



        // lets loop through collections now

        // i am looping through the fruit set here , but its able to work on any collection
        var i = fruitSet.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


        //lets do it using an enhanced for loop
        for(String item : fruitSet){
            System.out.println(item);
        }

        // another way to do this using a lambda expression
        fruitSet.forEach(y -> System.out.println(y));


        // now lets do this for the map
        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }



//        // another one
//        fruitCalories.forEach((k,y)-> System.out.println("Fruit :"+ k + ", Calories: " + y));


    }



}
