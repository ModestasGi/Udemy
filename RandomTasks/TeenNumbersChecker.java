package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class TeenNumbersChecker {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int fparam = ui.nextInt();
        int sparam = ui.nextInt();
        int tparam = ui.nextInt();

        System.out.println(hasTeen(fparam, sparam, tparam));

    }

    public static boolean hasTeen (int fparam, int sparam, int tparam){
        boolean check;
        check = ((fparam>=13 && fparam<=19)||(sparam>=13 && sparam<=19)||(tparam>=13 && tparam<=19));
        return check;
    }
}
