import java.util.Scanner;

public class centstoDollars{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("How many cents do you have?");
        int cents = scanner.nextInt();

        int rem = cents%100;
        int dollars = (cents-rem)/100;

        System.out.println("That is " + dollars + " dollars and " + rem + " cents.");
    }
}