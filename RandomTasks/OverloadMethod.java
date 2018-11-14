package JAVAMasterclasses.LessonsSamples;

import java.util.Scanner;

public class OverloadMethod {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int c = ui.nextInt();
/*
overloading sence:
in line 12 calling method passing one parameter and later on in line 36 of this method passing two parameters
to the next method witch requires these two parameters
*/
        calcFeetAndInchesToCentimeters(c);
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches<0){
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}