package org.example;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        stmapi();
        stmapi2();
    }
    public static void stmapi(){
        List<String> s1 = Arrays.asList("Apple","Banana","Mango");

        List<String> filterdList = s1.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        List<String> filterdList2 = s1.stream()
                .filter(s -> s.length()  == 5)
                .collect(Collectors.toList());
        System.out.println("All");
        System.out.println(s1);
        System.out.println("s.length > 5");
        System.out.println(filterdList);
        System.out.println("s.length == 5");
        System.out.println(filterdList2);
        System.out.println("--------------------------");
    }
    public  static void stmapi2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers);

        // Using lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Using lambda expression to map each number to its square
        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Using lambda expression to reduce the list to its sum
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}