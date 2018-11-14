package JAVAMasterclasses.MegaBytesChallenges;

import java.util.Scanner;

public class SolutionMegaBytesConverter {

    public static void main(String[]args){

        Scanner ui = new Scanner(System.in);

        int inputKB = ui.nextInt();

        printMegaBytesAndKiloBytes(inputKB);

    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int kb = kiloBytes % 1024; // this is a reminder
            int mb = kiloBytes/1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");

        }
    }
}
