package collection;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Bag<String> b1 = new Bag<>();
        b1.add("Banana");
        b1.add("Apple");
        b1.add("Orange");
        b1.remove("Banana");
        b1.remove("Apple");
        b1.remove("Orange");
        System.out.println(b1.get("Banana"));
    }
}
