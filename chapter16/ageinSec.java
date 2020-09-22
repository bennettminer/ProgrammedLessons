import java.util.Scanner;

public class ageinSec{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many years have you been alive?");
        int year = scanner.nextInt();

        System.out.println("How many months have you been alive?");
        int month = scanner.nextInt();

        System.out.println("How many days have you been alive?");
        int day = scanner.nextInt();

        int finalmonths = (year*12) + month;

        int finaldays = (year*365) + day;

        int sec = finaldays * 86400;

        System.out.println("You've been alive for " + sec + " seconds.");
    }
}