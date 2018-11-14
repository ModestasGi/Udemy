package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int n1 = ui.nextInt();
        int n2 = ui.nextInt();
        System.out.println(getGreatestCommonDivisor(n1, n2));
    }

    public static int getGreatestCommonDivisor(int n1, int n2){
        int cdivisor = 0;
        int l = n2;
        if(n1 < n2){
            l = n1;
        }

        if (n1 < 10 || n2 < 10){
            return -1;
        } else {
            for(int i = l; i > 0; i--){
                if (n1 % i == 0 && n2 % i == 0){
                    cdivisor = i;
                    break;
                }
            }
        }
        return cdivisor;
    }
}
