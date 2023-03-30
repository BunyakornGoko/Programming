package org.example;

import mobilebank.Banking;
import mobilebank.K_PLUS;
import mobilebank.Mymo;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

import java.nio.file.AccessMode;

public class Main {
    public static void main(String[] args) {
        TestMobileBanking();
        TestCheckBanking();
        TestWithDraw();
        TestTranferto();
        Collection();
        TestDeposit();
        TestCheckCoins();
    }
    public static void TestMobileBanking(){
        K_PLUS k1 = new K_PLUS("Bunyakorn",12345,1000);
        Mymo m1 = new Mymo("Tonnam",12346,1000);
        System.out.println(k1.toString());
        System.out.println("Operating sound is : " + k1.operating_sound());
        System.out.println(m1.toString());
        System.out.println("Operating sound is : " + m1.operating_sound());
        System.out.println("--------------------------------------------");
    }
    public static void TestCheckBanking(){
        Mymo m2 = new Mymo("Blue",12348,1000);
        System.out.println(m2.toString());
        System.out.println(m2.getBalance());
        System.out.println(m2.checkBanking(500));
        System.out.println(m2.checkBanking(1200));
        System.out.println("--------------------------------------------");
    }
    public static void TestWithDraw(){
        Mymo m3 = new Mymo("Oat",14256,500);
        System.out.println("Balance1: " + m3.getBalance());
        m3.withdraw(300);
        System.out.println("Withdraw: " + m3.getWithdraw());
        System.out.println("Balance2: " + m3.getBalance());
        m3.withdraw(20);
        System.out.println("Withdraw: " + m3.getWithdraw());
        System.out.println("Balance3: " + m3.getBalance());
        System.out.println("--------------------------------------------");
    }
    public static void TestTranferto(){
        K_PLUS k3 = new K_PLUS("Joko",55555,1000);
        Mymo m3 = new Mymo("Tew",66666,0);
        System.out.println(k3);
        System.out.println(m3);
        k3.transfer(m3,200);
        System.out.println(k3);
        System.out.println(m3);
        System.out.println("--------------------------------------------");

    }
    public static void Collection(){
        Map m = new HashMap();
        K_PLUS k4 = new K_PLUS("Bom",77777,5000);
        Mymo m4 = new Mymo("Pam",54634,2000);
        m.put(1,k4);
        m.put(2,m4);
        for(int i=1 ; i <= m.size();i++){
            System.out.println(m.get(i));
        }
        System.out.println("--------------------------------------------");
    }
    public static void TestDeposit(){
        Banking k5 = new K_PLUS("Fonbeer",65108,1000);
        System.out.println(k5.toString());
        k5.deposit(500);
        k5.deposit(500);
        System.out.println(k5.toString());
        System.out.println("--------------------------------------------");
    }
    public  static void TestCheckCoins(){
        Banking k6 = new K_PLUS("Kong",78905,5000);
        System.out.println(k6.toString());
        k6.getMyCoins(1370);
        System.out.println(k6.toString());
        System.out.println("Your account have coins :" + k6.getCoins());
        System.out.println("--------------------------------------------");

    }
}