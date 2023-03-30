package org.example;

public class EnumTutorial {
    public static void main(String[] args) {
        TestDayOfTheWeek();
        TestCereals();
    }
    static void TestDayOfTheWeek(){
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if(day == DaysOfTheWeek.THURSDAY){
            System.out.println("Yeaaa");
        }
        for (DaysOfTheWeek myday : DaysOfTheWeek.values()){
            System.out.println(myday);
        }
        System.out.println("-------------------");
    }
    static void TestCereals(){
        Cereals.COCOA_PUFFS.levelOfDeliciousness = 500;
        System.out.println(Cereals.COCOA_PUFFS.levelOfDeliciousness);
        System.out.println(Cereals.CONFLEX.levelOfDeliciousness);

        for(Cereals cereals : Cereals.values()){
            System.out.println(cereals);
        }
        System.out.println("--------------------");
    }
}