package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LL_1();
        HM_1();
        VT_1();
        LT();
        ST();
        ARL();

    }
    public static void LL_1(){
        System.out.println("LinkedList");
        List l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("Size is " + l.size());
        System.out.println("The Content Are : " + l);
        System.out.println("The first one is " + l.get(0));
        System.out.println("Index of 1 is " + l.indexOf(1));
        l.remove(0); // remove l(0) that is 1
        System.out.println("----------------------------------");
    }
    public static void HM_1(){
        System.out.println("HashMap");
        Map m = new HashMap();
        m.put(1,"Hello");
        m.put(2,"Goko");
        m.put(3,"Hi");
        m.remove(1); //remove m(1) that is delete Hello
        System.out.println("Index 2 in map is " + m.get(2));
        System.out.println("Key of the map is " + m.keySet());
        System.out.println("Content in the map are : " + m.entrySet());
        System.out.println("----------------------------------");
    }
    public static void VT_1(){
        System.out.println("Vector");
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) System.out.println(e.nextElement());
        System.out.println("----------------------------------");
    }
    public static void LT(){
        System.out.println("List");
        List<String> myList = new ArrayList<>();

        // Adding elements to the List
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // Iterating through the List using a for loop
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("----------------------------------");
    }
    public static void ST(){
        System.out.println("Set");
        // Creating a Set of Integers
        Set<Integer> mySet = new HashSet<>();

        // Adding elements to the Set
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        // Iterating through the Set using a for-each loop
        for (int i : mySet) {
            System.out.println(i);
        }
        System.out.println("----------------------------------");
    }
    public static void ARL(){
        System.out.println("ArrayList");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Goko");
        arrayList.add("Tonnam");
        arrayList.add("Blue");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println("----------------------------------");
    }
}