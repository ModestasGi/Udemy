package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class LargestPrime {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int number = ui.nextInt();
        System.out.println(getLargestPrime(number));
        ui.close();
    }

    public static int getLargestPrime(int number) {
        if (number < 2){
            return -1;
        }
        int res = 0;

        for (int i = 0; i < number; i++) {
            double temp = number - i;
            boolean flag = false;
            for (int j = 2; j <= temp / 2; j++) {
                if (temp % j == 0) {
                    flag = true;
                }
            }

            if (!flag) {
                double temp2 = (double ) number / temp;
                if (temp2 - Math.floor(temp2) == 0) {
                    res = (int) temp;
                    break;
                }
            }
        }
        return res;
    }
}
