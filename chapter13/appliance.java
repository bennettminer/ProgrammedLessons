import java.util.Scanner;

public class appliance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter cost per kilowatt-hour  in cents");
        double cost = scanner.nextDouble();

        System.out.println("Enter kilowatt-hours used per year");
        double hour = scanner.nextDouble();

        double annual = cost*hour;

        System.out.println("Annual Cost: " + annual);
    }
}