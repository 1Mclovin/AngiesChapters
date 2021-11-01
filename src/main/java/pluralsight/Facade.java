package pluralsight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Facade {
    //this class is pronounced literally as Fassad.
    // just make sure to pronounce correctly or people will get panties in a bunch (apparently)
    /*
    you can wrap this inside of a poor api to hide user detail
    it simplifies the interface or client usage
    this is a class that uses compilation so no need for inheritance
    the open stream method handles all of the connections
    this is typically only used to clean up poor code people may have to use this on my code .lol
    this is a refactoring pattern so dont use this upfront. use this after if it looks bulky and written poorly




     */
    public static void main(String[] args) {
        // here is an everyday example
        //wont work if we try to run this though
//        URL url = new URL("Http","www.pluralsight.com", 80,"/author/bryan-hansen");
//
//        BufferedReader in = new BufferedReader(
//                new InputStreamReader(url.openStream()));
//
//        String inputLine;
//
//        while((inputLine = in.readLine())) != null){
//            System.out.println(inputLine);
//        }

    }

}
