package org.example;

public class TryCatchExample {

    public static void main(String[] args) {
        try {
            System.out.println("before");
            System.out.println(9 / 3);
            System.out.println("after");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("all the time print it");
        }
    }
}
