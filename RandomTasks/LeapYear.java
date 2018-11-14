package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        int year = ui.nextInt();
        System.out.println(isLeapYear(year));
    }
    private static boolean isLeapYear(int year){

        boolean yearL;

        if(year <= 0 || year > 9999){
            yearL = false;

            System.out.println("first constraint");
        } else
            {
            if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                yearL = true;
                System.out.println("second constraint 1");
            } else {yearL = false;
                System.out.println("second constraint 2");}
        }
        return yearL;
    }
}
