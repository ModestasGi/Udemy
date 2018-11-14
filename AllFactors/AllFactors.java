package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class AllFactors {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int number = ui.nextInt();

        printFactors(number);
        delayOfExecution(2000);
        System.out.println("Jumping to other method of calculation");
        printFactorsWhile(number);
        System.out.println("Task is finished. Thanks for your patient");
    }

    public static void printFactors(int n) {

        if (n < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                delayOfExecution(2000);
                System.out.println(i);
            }
        }
    }

    public static void printFactorsWhile(int n){
        if (n < 0) {
            System.out.println("Invalid Value");
        }
        int i = 1;
        while (i <= n){
            if (n % i == 0) {
                delayOfExecution(2000);
                System.out.println(i);
            }
            i++;
        }
    }

    public static void delayOfExecution(long n){
        try {
            Thread.sleep(n);
            System.out.println("working on task :) sorry for delay ");
            Thread.sleep(n);
            System.out.println("still calculating... it's a hard task :(");
            Thread.sleep(n);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
