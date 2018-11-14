package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class NumerToWords {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int n = ui.nextInt();
        numberToWords(n);
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid number");
        } else {
            String s = String.valueOf(number);
            int[] sequenceOfnumber = new int[s.length()];
            for (int i = 0; i < s.length(); i++){
                sequenceOfnumber[i] = Character.digit(s.charAt(i), 10);
            }
            for(int j = 0; j < sequenceOfnumber.length; j++){
                int temp = sequenceOfnumber[j];
                switch (temp){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Ten");
                }
            }
        }
    }
}
