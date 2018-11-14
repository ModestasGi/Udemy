package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class LastDigitChecker {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int n1 = ui.nextInt();
        int n2 = ui.nextInt();
        int n3 = ui.nextInt();
        System.out.println(hasSameLastDigit(n1, n2, n3));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (n1 < 10 || n1 > 1000 || n2 < 10 || n2 > 1000 || n3 < 10 || n3 > 1000) {
            return false;
        }
        int n1rem = n1 % 10;
        int n2rem = n2 % 10;
        int n3rem = n3 % 10;
        return n1rem == n2rem || n1rem == n3rem || n2rem == n3rem;
    }
}
