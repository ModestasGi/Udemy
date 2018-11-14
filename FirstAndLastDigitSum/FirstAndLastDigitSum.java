package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        Scanner ui = new Scanner(System.in);

        int number = ui.nextInt();

        System.out.println(sumFirstAndLastDigit(number));
    }

    public static Integer sumFirstAndLastDigit(int number) {
        int result;
        if (number < 0) {
            result = -1;
        } else if (number > 0 && number < 10) {
            result = number + number;
        } else {
            String nAsString = (new Integer(number)).toString();
            char[] chArr = nAsString.toCharArray();
            int[] nAsArray = new int[chArr.length];
            for(int i = 0; i < chArr.length; i++){
                nAsArray[i] = Character.getNumericValue(chArr[i]);
            }
            result = nAsArray[0] + nAsArray[nAsArray.length-1];
        }
        return result;
    }
}
