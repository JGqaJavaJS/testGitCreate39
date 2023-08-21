package org.example;
import java.util.ArrayList;
import java.util.List;

public class ListExample {



    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        first.add(5);
        System.out.println(first.get(0));
      //  System.out.println(first.get(1));
//        try {
//            System.out.println(first.get(1)); //  finished with non-zero exit value 1
//        } catch (Exception e) {
//            //throw new RuntimeException(e);
//            e.printStackTrace();
//        }
// forEaxh and set
        first.add(7);
        first.forEach(n-> System.out.println(n));
        first.set(1, 0);
        first.forEach(n -> System.out.println(n));
    }


}
