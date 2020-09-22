import java.util.Scanner;

public class orderChecker{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many bolts are you ordering?");
        int bolt = scanner.nextInt();

        System.out.println("How many nuts are you ordering?");
        int nut = scanner.nextInt();

        System.out.println("How many washers are you ordering?");
        int washer = scanner.nextInt();

        int multipliedBolt = bolt*2;

        int cost = (bolt*5) + (nut*3) + (washer);

        if (nut >= bolt){
            if (multipliedBolt == washer){
                System.out.println("Your order is correct");

                System.out.println("The price of the order is: " + cost);
            }
            else {
                System.out.println("You need more washers");

                System.out.println("The price of the order is: " + cost);
            }
        }
        else{
            System.out.println("Your order is incorrect. Get more nuts");

            System.out.println("The price of the order is: " + cost);
        }
    }
}