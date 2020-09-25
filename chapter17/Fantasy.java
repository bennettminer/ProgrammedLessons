import java.util.Scanner;

public class Fantasy{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest");

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Enter strength (1-10):");
        int strength = scanner.nextInt();

        System.out.println("Enter health (1-10):");
        int health = scanner.nextInt();

        System.out.println("Enter luck (1-10):");
        int luck = scanner.nextInt();

        int total = strength+health+luck;

        if (total > 15){
            System.out.println("Your stats are too high! Default values are being set:");
            strength=5;
            health=5;
            luck=5;

            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
        } 
        else {
            System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
        }
    }
}