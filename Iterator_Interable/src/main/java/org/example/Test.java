package org.example;

public class Test {
    public static void main(String[] args) {
        Example<String> example = new Example<>();

        example.add("Test 1");
        example.add("Test 2");
        example.add("Test 3");
        example.add("Test 4");
        example.add("Test 5");
        example.add("Test 6");
        example.add("Test 7");

        for (String str : example){
            System.out.println(str);
        }
    }
}
