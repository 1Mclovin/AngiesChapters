package chapter8;

public class TextProcessor {


    public static void main(String[] args) {
    countWords("I love test Auto Uni");

    // another method that prints out string backwards
    reverseString("Hello YoungBull!");

    }
    // this is the second method that reverses the string
    private static void reverseString(String  text) {
        for (int i = text.length() -1; i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:",numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }







    }
}
