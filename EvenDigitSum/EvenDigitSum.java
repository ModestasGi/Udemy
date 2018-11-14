package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class EvenDigitSum {

    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        int number = ui.nextInt();
        System.out.println(getEvenDigitSum(number));
    }
     private static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            sum = -1;
        } else {
            String nAsString = (new Integer(number)).toString();
            char[] chArr = nAsString.toCharArray();
            int[] nAsArray = new int[chArr.length];
            for(int i = 0; i < chArr.length; i++){
                nAsArray[i] = Character.getNumericValue(chArr[i]);
            }
            for (int aNAsArray : nAsArray) {
                if (aNAsArray % 2 == 0) {
                    sum += aNAsArray;
                }
            }
        }
        return sum;
     }
}
