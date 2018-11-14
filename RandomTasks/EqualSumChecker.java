package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class EqualSumChecker {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int fparam = ui.nextInt();
        int sparam = ui.nextInt();
        int tparam = ui.nextInt();

        System.out.println(hasEqualSum(fparam, sparam, tparam));

    }

    public static boolean hasEqualSum (int fparam, int sparam, int tparam){
        boolean check;
       check = (fparam + sparam == tparam);
        return check;
    }
}
