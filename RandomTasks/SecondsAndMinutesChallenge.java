package JAVAMasterclasses.LessonsSamples;

import java.util.Scanner;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        String type = "Type in the value:";
        String s = "Invalid input of time!";

        Scanner ui = new Scanner(System.in);
        System.out.println("Choose and type-in the input option for conversion into wider format + Enter:\n1 - for hours minutes and seconds;\n2 - for minutes and seconds;\n3 - only for seconds;");
        byte input = ui.nextByte();
        switch (input) {
            case 1:
                System.out.println(type);
                long hours = ui.nextLong();
                long minutes = ui.nextLong();
                long seconds = ui.nextLong();
                ui.close();
                if ((minutes < 0 || minutes > 59) || (seconds < 0 || seconds > 59)) {
                    System.out.println(s);
                } else getDurationString(hours, minutes, seconds);
                break;
            case 2:
                System.out.println(type);
                minutes = ui.nextLong();
                seconds = ui.nextLong();
                ui.close();
                if (seconds < 0 || seconds > 59) {
                    System.out.println(s);
                } else {
                    getDurationString(minutes, seconds);
                }
                break;
            case 3:
                System.out.println(type);
                seconds = ui.nextLong();
                getDurationString(seconds);
                ui.close();
                break;
            default:
                System.out.println("Invalid option!");
        }
        ui.close();
    }

    private static void printResult(long years, long months, long days, long hours, long minutes, long seconds) {

        System.out.println(years + "y " + months + "m " + days + "d " + hours + "h " + minutes + "min " + seconds + "s;");

    }

    private static void getDurationString(long months, long days, long hours, long minutes, long seconds) {
        long years = months / 12;
        months = months % 12;
        printResult(years, months, days, hours, minutes, seconds);
    }

    private static void getDurationString(long days, long hours, long minutes, long seconds) {
        long months = days / 30;
        days = days % 30;
        getDurationString(months, days, hours, minutes, seconds);
    }

    private static void getDurationString(long hours, long minutes, long seconds) {
        long days = hours / 24;
        hours = hours % 24;
        getDurationString(days, hours, minutes, seconds);
    }

    private static void getDurationString(long minutes, long seconds) {
        long hours = minutes / 60;
        minutes = minutes % 60;
        getDurationString(hours, minutes, seconds);
    }

    private static void getDurationString(long seconds) {
        long minutes = seconds / 60;
        seconds = seconds % 60;
        getDurationString(minutes, seconds);
    }

}
