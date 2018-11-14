package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class DiagonalStar {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int n = ui.nextInt();
        printSquareStar(n);
        ui.close();
    }

    private static void printSquareStar(int n){
        if (n < 5){
            System.out.println("Invalid number");
        } else {
            // Loop denoting rows
            for (int i = 0; i < n; i++) {
                // Loop denoting columns
                for (int j = 0; j < n; j++) {

                    if (i == 0 // printing upper line
                            || j == 0 // printing first column
                            || i == j // printing diagonal from up left corner toward right bottom corner
                            || i == n - 1 // printing botom line
                            || j == n - 1 // printing last column
                            || i + j == n - 1 // printing diagonal from up right corner toward left bottom corner
                    ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
