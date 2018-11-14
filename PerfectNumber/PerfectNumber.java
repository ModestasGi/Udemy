package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int n = ui.nextInt();
        System.out.println(isPerfectNumber(n));
    }

    public static boolean isPerfectNumber(int n){
        int comparator = 0;
        if(n < 1){
            return false;
        } else
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    comparator += i;
                    if(comparator == n){
                        return true;
                    }
                }
            }
            return false;
    }
}
