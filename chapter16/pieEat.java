import java.util.Scanner;

public class pieEat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the weight of the contestant?");
        int weight = scanner.nextInt();

        if (weight >= 220 && weight <= 280 || weight == 250){
            System.out.println("The contestant is allowed to participate.");
        }
        else{
            System.out.println("The contestant is not allowed to participate.");
        }
    }
}