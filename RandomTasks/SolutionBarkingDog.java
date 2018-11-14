package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class SolutionBarkingDog {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        boolean barkingI = ui.nextBoolean();
        byte hourOfDayI = ui.nextByte();

        System.out.println(bark(barkingI, hourOfDayI));
    }


        private static boolean bark(boolean barking, byte hourOfDay){

            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            if (barking) {
                if (hourOfDay == 23){
                    return true;
                } else if (hourOfDay < 8){
                    return true;
                }return false;

            } else

                return false;
        }


}
