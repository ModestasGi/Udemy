package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class FlourPackProblem {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);
        int bigCount = ui.nextInt();
        int smallCount = ui.nextInt();
        int goal = ui.nextInt();

        System.out.println(canPack(bigCount, smallCount, goal));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int canPackage = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int[] bC = new int[bigCount + 1];
        bC[0] = 0;
        int[] sC = new int[smallCount + 1];
        sC[0] = 0;


        if (!(bigCount == 0)) {
            for (int i = 1; i <= bigCount; i++) {
                bC[i] = 5;
            }
        }
        if (!(smallCount == 0)) {
            for (int j = 1; j <= smallCount; j++) {
                sC[j] = 1;
            }
        }

        for (int y = 0; y <= bigCount; y++){

            canPackage += bC[y];

            int tempPackage = canPackage;

            for (int z = 0; z <= smallCount; z++){

                tempPackage += sC[z];

                if (tempPackage == goal){

                    return true;
                }

            }
        }
        return false;
    }
}
