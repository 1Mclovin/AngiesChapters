package chapter7;

import java.util.Arrays;
import java.util.Random;

public class SearchArrays {
    // when making something final make the convention in all caps

    // Arrays are pretty easy

    // Random class allows you to generate random values
    // Random random = new Random();

    private static final int LENGTH = 6;

    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
    // this sorts the ticket in ascending order
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0;i < LENGTH; i++){

       int randomNumber;

       do{
         randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
       }while(search(ticket, randomNumber));

            ticket[i] =randomNumber;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }
    }

    // this method does a sequential search on the array to find a value
public static boolean search(int[]array, int numberToSearchFor){

        // this is called an enhanced loop.
    //it itterates through 'array' and each time assigns the current element to 'value'

    for(int value : array){
        if (value == numberToSearchFor){
            return true;
        }
    }

    // if we reached this point then the entire array was searched and value was not found
    return false;
}
public static boolean binarySearch(int[] array, int numberToSearchFor){
        // array must be sorted first
    Arrays.sort(array);

   int index =  Arrays.binarySearch(array,numberToSearchFor);

   if(index >= 0 ){
       return true;
   }
   else return false;
}


}
