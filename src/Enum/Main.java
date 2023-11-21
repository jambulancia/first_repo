package Enum;

public class Main {
    public static void main(String[] args) {
         DaysOfTheWeek day = DaysOfTheWeek.MONDAY;
         if (day == DaysOfTheWeek.MONDAY) System.out.println("yes");
         for (DaysOfTheWeek myDay: DaysOfTheWeek.values()){
             System.out.println(myDay );
         }
        System.out.println(Cereals.CAPTAIN_CRUNCH.rate);
    }
}
