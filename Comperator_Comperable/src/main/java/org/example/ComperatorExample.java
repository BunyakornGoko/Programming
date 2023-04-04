package org.example;

import java.util.*;

public class ComperatorExample {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Water","Drinks",10F,100));
        items.add(new Item("Lays","Snacks",22.5F,20));
        items.add(new Item("Chocolate","Snacks",55.5f,50));
        items.add(new Item("Pencil","Tools",13.2f,1000));
        items.add(new Item("Paper","Tools",2.5f,10000));
        items.add(new Item("Coke","Drinks",18f,20));

        //comperable ต้อง implementมาใน คลาสของเรา
        Collections.sort(items);

        //comperator
//        items.sort(new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                //จากน้อยไปมาก
//                return (int)(o1.getPrice() - o2.getPrice());
//            }
//        });
        for (Item item: items) {
            System.out.printf("Name: %s , Category: %s , Price: %.2f , Stock: %d%n" ,
                    item.getName(), item.getCategory() , item.getPrice(),item.getStocks());
        }
    }
}