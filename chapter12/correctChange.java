import java.util.Scanner;

public class correctChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the amount of money you have?");
        int amount = scanner.nextInt();
        
        int dollars = amount/100;
        if (dollars > 0){
            amount = amount % 100;           
        }

        int quarters = amount/25;
        if (quarters > 0){
            amount = amount % 25;
        }

        int dimes = amount/10;
        if (dimes > 0){
            amount = amount%10;
        }

        int nickels = amount/5;
        if (nickels > 0){
            amount = amount%5;
        }

        int pennies = amount/1;
        if (pennies > 0){
            amount = amount%1;
        }

        System.out.println("Your change is: " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), " + pennies + " penny(ies)."  );
    }
}