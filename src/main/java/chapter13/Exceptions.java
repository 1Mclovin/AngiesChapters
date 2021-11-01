//package chapter13;
//
//import java.io.File;
//import java.io.IOException;
//
//public class Exceptions {
//    public static void main(String[] args) {
//        createNewFile();
//    }
//
//    public static void createNewFile(){
//        File file = new File("resources/nonexistent.txt");
//        try{
//            file.createNewFile();
//        }catch(IOException e){
//            System.out.println("directory does not exist");
//            e.printStackTrace();
//        }
//    }
//
//
//}
