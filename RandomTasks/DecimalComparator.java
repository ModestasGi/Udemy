package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class DecimalComparator {

    public static void main(String[] args) {

        // DecimalFormat df = new DecimalFormat(".000");

        Scanner ui = new Scanner(System.in);

        double firstParam = ui.nextDouble();
        double secondParam = ui.nextDouble();


        System.out.println(areEqualByThreeDecimalPlaces(firstParam, secondParam));
    }

    public static boolean areEqualByThreeDecimalPlaces (double firstParam, double secondParam){
        boolean check;
        double fp, sp;

        if (firstParam < 0){
            fp = Math.ceil(firstParam *1000)/1000;
        } else {
            fp = Math.floor(firstParam * 1000)/1000;
        } firstParam = fp;

        if (secondParam < 0) {
            sp = Math.ceil(secondParam*1000)/1000;
        } else {
            sp = Math.floor(secondParam*1000)/1000;
        } secondParam = sp;

        if(firstParam == secondParam){
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}
