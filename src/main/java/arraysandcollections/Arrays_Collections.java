package arraysandcollections;

import java.util.Arrays;

public class Arrays_Collections {
    public static void main(String[] args) {
        // what is a collection?
        //its a a group of items
        // they are items indexed by number position or key
        // a list is a collection of elements that can also have duplicates
        // Sets only have unique elements no duplicates
        // Queues
        //Maps are key based unique and performance doesnt change as this list grows


        //lets declare an array
        int[] ids = new int[10];
        System.out.println(ids[1]);
        // this will always print out 0

        String[] instruments = new String[]{"Guitar","Drum","Bass"};
        System.out.println(instruments[2]);

        // prints out the size of the array
        System.out.println(instruments.length);
        //lets iterate through the elements
        for(int i = 0; i < ids.length;i++){
        //   this code squares each value of i as it arates through the loop and assignes it to a position in the array
            ids[i] = i*i;
            // this will end the array
            System.out.println(ids[i]);
        }

        // another for loop method to iterate through an array
        for(String instrument : instruments){
            System.out.println(instrument);
        }

        // this will sort our array of instruments in alphabetical order
        Arrays.sort(instruments);
        System.out.println(Arrays.toString(instruments));

        //lets create a new array to use the search method
        int fibSeqArray[] = new int[] {0,1,5,2,3,1,8,13};
      // ALWAYS sort an array before doing the binary search or anything else
        Arrays.sort(fibSeqArray);
        System.out.println(Arrays.binarySearch(fibSeqArray,3));


        // we can create multidimensional arrays but its pretty complicated so stick to 1 array ata time lol
     //   int [][] multiArray
    }
}
