package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        int number1 = ui.nextInt();
        int number2 = ui.nextInt();
        System.out.println(hasSharedDigit(number1, number2));
    }
    private static boolean hasSharedDigit(int n1, int n2){
            boolean result = false;
        if (n1 <= 10 || n1 >= 99 || n2 <= 10 || n2 >= 99){
            return false;
        } else {
            int[] n1arr = numberIntoArray(n1);
            int[] n2arr = numberIntoArray(n2);

            if(n1arr[0] == n2arr[0] || n1arr[1] == n2arr[0] || n1arr[0] == n2arr[1] || n1arr[1] == n2arr[1]){
                result = true;
            }
        }
        return result;
    }

    private static int[] numberIntoArray (int n){
        String nAsString = (new Integer(n)).toString();
        char[] chArr = nAsString.toCharArray();
        int[] nAsArray = new int[chArr.length];
        for(int i = 0; i < chArr.length; i++){
            nAsArray[i] = Character.getNumericValue(chArr[i]);
        }
        return nAsArray;
    }
}
