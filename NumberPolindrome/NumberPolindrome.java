package JAVAMasterclasses.TestingArea;

import java.util.Scanner;

public class NumberPolindrome {

    public static void main(String[] args){

        Scanner ui = new Scanner(System.in);
        int number = ui.nextInt();

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number){
        int n = Math.abs(number);
        String s = String.valueOf(n);
        int[] sequenceOfnumber = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            sequenceOfnumber[i] = Character.digit(s.charAt(i), 10);
        }
        for (int j = 0; j < s.length()/2; j++){
            if(!(sequenceOfnumber[j] == sequenceOfnumber[s.length()-1-j])){
               return false;
            }
        }
        return true;
    }
}
