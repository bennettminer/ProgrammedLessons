import java.util.Scanner;

public class JetLag{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours have you traveled?");
        int hours = scanner.nextInt();

        System.out.println("How many time zones have you crossed?");
        int zones = scanner.nextInt();

        System.out.println("Pick what time you departed and use the number provided: \n0, for departures between 8AM and noon \n1, for departures between noon and 6PM \n3, for departures between 6PM and 10PM \n4, for departures between 10PM and 1AM \n5, for departures between 1AM and 8AM");
        int depart = scanner.nextInt();

        System.out.println("Pick what time you arrived and use the number provided: \n4, for arrivals between 8AM and noon \n2, for arrivals between noon and 6PM \n0, for arrivals between 6PM and 10PM \n1, for arrivals between 10PM and 1AM \n3, for arrivals between 1AM and 8AM");
        int arrive = scanner.nextInt();

        double recovery = ((hours/2 + (zones-3) + depart + arrive))/10.0;

        System.out.println("You will need " + recovery + " days to recover from Jet Lag.");
    }
}