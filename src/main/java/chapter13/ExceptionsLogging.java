//package chapter13;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;
//
//public class ExceptionsLogging {

//    // logging allows us to capture and create
//    // in the logging api you can log different levels of messages
//
//    // private static Logger logger.getLogger(Hashmap //more in here)
//
//    // exception example below
//    // in order to read an exception you go from down to up
//
//
//    public static void main(String[] args)throws IOException{
//        char [] grades = {'A','B','D'};
//       // this wouldnt work because we are goint out of bounds rhus giving us the exception
//        System.out.println(grades[10]);
//
//        checkedException();
//    }
//
//    public static void checkedException() throws IOException {
//        List<String> lines = Collections.emptyList();
//
//        lines = Files.readAllLines(Paths.get("C:\\Users\\raulh\\IdeaProjects\\JavaNewNotesHw\\src\\main\\resources\\names"));
//
//        //this is so I can read whats in that file above me
//        Iterator<String>iterator = lines.iterator();
//        while(iterator.hasNext())
//            System.out.println(iterator.next());
//    }
//public static void findeFile() throws MyCustomException{
//    throw new MyCustomException()
//}
//
//    public static void main(String[] args) {
//
//    }
//}
