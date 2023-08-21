package org.example;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = new int[5]; // Creates an integer array of size 5
        numbers[0] = 7;
        numbers[1] = 5;
        //System.out.println(numbers);
        for(int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] first = {1,2,3};

        for(int i = 0; i<first.length; i++) {
            System.out.println(first[i]);
        }

        for (int j : first) {
            System.out.println(j);
        }

    }

    int[] first = {1,2,3};

    int[] numbers = new int[5]; // Creates an integer array of size 5


    //int[] numbers2 = createArray(1, 2, 3, 4, 5);

    // Varargs method
    public static char[] createArray(char... keys) {
        return keys;
    }

}
