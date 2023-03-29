package org.example;
import book.*;
public class Main {
    public static void main(String[] args) {
        TestComicBook();
    }
    static void TestComicBook(){
        Comicbook c1 = new Comicbook("SPY X FAMILY",100,5);
        System.out.println(c1.toString());
        c1.open(50);
        printIsBookOpen(c1);
        c1.open(120);
    }
    static void printIsBookOpen(Book book){
        if(book.isIsbookopen()){
            System.out.println("A book is opened");
        }else{
            System.out.println("A book is closed");
        }
    }
}