package org.example;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        testPhoneNumber();
    }
    static boolean isPhoneNumberValid(String phonenumber){
        return phonenumber.startsWith("089") && phonenumber.length() == 10;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phonenumber ->
            phonenumber.startsWith("089") && phonenumber.length() == 10;

    static Predicate<String> containsNumber = phonenumber ->
            phonenumber.contains("5");
    static Predicate<String> notcontainsNumber = phonenumber ->
            !(phonenumber.contains("6"));

    public static void testPhoneNumber(){
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0890000000"));
        System.out.println(isPhoneNumberValid("0100000000"));
        System.out.println(isPhoneNumberValid("0988888888"));
        System.out.println("-----------------------");
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0890000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0100000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900000000"));
        System.out.println(containsNumber.test("0755555555"));
        System.out.println(notcontainsNumber.test("0111111111"));
        System.out.println(notcontainsNumber.test("0611111111"));
        System.out.println("------------------------");
        System.out.println("Is phone number valid and contains number 5");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber).test("0895555555"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber).test("0894444444"));
    }
}