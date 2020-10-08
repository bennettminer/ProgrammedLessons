import java.util.Scanner;

public class AddInts{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers do you want to add?");
        int amount = scanner.nextInt();
        int i = 0;
        int sum = 0;
        int integer = 0;

        while (i==amount){
            integer = 0;
            System.out.println("Enter an integer: ");
            integer = scanner.nextInt();

            sum = sum + integer;
            if (integer > 0) {
                i = i + 1;
            }
        }
        System.out.println("The sum is: " + integer);
    }
}