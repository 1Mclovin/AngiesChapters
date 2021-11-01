package arraysandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listss {
    public static void main(String[] args) {
    // lets learn about the array list
    ArrayList<String> arrayList = new ArrayList<>();

    // another way to declare an array list using the list

        List<String> colors = new ArrayList<>();

        //we can add by using the add method
        colors.add("Green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("Purple");
        colors.add(1,"Orange");

        //lets iterate through this array
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

       //lets convert an array to a list
        String buffetItems [] = new String[]{"Mac and Cheese","Fries","Pizza","Wings","Lo-Mein"};
        //now lets convert it
        List<String> buffetArrayList = new ArrayList(List.of(buffetItems));
        System.out.println(buffetArrayList);
        System.out.println(buffetArrayList.getClass());

        //now lets create a linked list

        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        System.out.println(orders);
        orders.removeFirst();
        System.out.println(orders);


        // lets sort a list
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(14);
        numberList.add(7);
        numberList.add(2);
        numberList.add(5);

        // this sorts out the number list
        Collections.sort(numberList);
        System.out.println(numberList);



    }

}
