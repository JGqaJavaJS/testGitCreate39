package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using filter to select even numbers from the list
        List<Integer> evenNumbers = numbers.stream()
                .filter(some -> some % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
        entryStream.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}