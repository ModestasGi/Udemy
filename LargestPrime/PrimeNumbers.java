package JAVAMasterclasses.TestingArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);
        System.out.println("To check if number is prime press a");
        System.out.println("To know particular max list of prime numbers press b");
        System.out.println("To know the list of prime numbers between particular gap of numbers press c");
        System.out.println("To know the closest prime number(-s) to your given number press d");
        System.out.println("To calculate the largest prime factor of a given number press e");
        String check = ui.nextLine();
        switch (check) {
            case "a":
                System.out.println("insert number (number >= 2) you want to check if it is a prime number");
                long number = ui.nextLong();
                System.out.println(checkIfPrime(number));
                break;
            case "b":
                System.out.println("insert the last number till what to show the row of prime numbers");
                long limit = ui.nextLong();
                printPrimeRow(-1, limit).forEach(System.out::println);
                break;
            case "c":
                System.out.println("insert two numbers between which you want to know the list of prime numbers");
                System.out.println("First number lower limit (number >= 2), second - upper limit");
                long min = ui.nextLong();
                long max = ui.nextLong();
                List<Long> printR = printPrimeRow(min, max);
                printR.forEach(System.out::println);
                break;
            case "d":
                System.out.println("insert the number (number >= 2) you want to know what is the proximate prime number(-s)");
                long num = ui.nextLong();
                printProximatePrime(num).forEach(System.out::println);
                break;
            case "e":
                System.out.println("insert the number (number >= 2) you want to know what is the largest prime factor of it");
                int numFactor = ui.nextInt();
                System.out.println(getLargestPrime(numFactor));
                break;
            default:
                System.out.println("Unknown option");

        }

        ui.close();

    }


    private static List printPrimeRow(long min, long max) {
        List<Long> primeRow = new ArrayList<>();
        long x;
        if (min == -1) {
            x = 0;
        } else {
            x = min;
        }
        while (x < max) {
            boolean flag = checkIfPrime(x);
            if (flag) {
                primeRow.add(x);
            }
            x++;
        }
        return primeRow;
    }

    private static List printProximatePrime(long num) {
        List<Long> proxPrime = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            long temp1 = num - i;
            long temp2 = num + i;
            if (checkIfPrime(temp1) && checkIfPrime(temp2)) {
                proxPrime.add(temp1);
                proxPrime.add(temp2);
                break;
            } else if (checkIfPrime(temp1)) {
                proxPrime.add(temp1);
                break;
            } else if (checkIfPrime(temp2)) {
                proxPrime.add(temp2);
                break;
            }
        }
        return proxPrime;
    }

    private static int getLargestPrime(int number) {
        int res = 0;

        for (int i = 0; i < number; i++) {
            double temp = number - i;
            if (checkIfPrime((long) temp)) {
                double temp2 = (double ) number / temp;
                if (temp2 - Math.floor(temp2) == 0) {
                    res = (int) temp;
                    break;
                }
            }
        }

        return res;
    }

    private static boolean checkIfPrime(long x) {
        boolean flag = false;
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                flag = true;
            }
        }
        if (flag) {
            return false;
        } else
            return true;
    }
}
