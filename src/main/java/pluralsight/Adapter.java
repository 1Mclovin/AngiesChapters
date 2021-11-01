package pluralsight;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    /*
    this converts an interface into another interface
    translates requests
    client,Adapter,Adaptee
    its client centric
    integrates new with the old
    adapters are pretty lite tbh
    A pit-fall just dont overcomplicate them
    dont add functionality

     */
    public static void main(String[] args) {
        // example of an everyday adapter
        // it would be Arrays.asList method
        // only shows one adapter in use

        Integer[] arrayOfInts = new Integer[]{42,43,44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);

        System.out.println(listOfInts);

    }
}
