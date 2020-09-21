import java.util.Scanner;

public class brickTravel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of seconds: ");
        double s = scanner.nextDouble();

        double g = 32.174;

        double t = s*s;

        double d = (g*t)/2;

        System.out.println("G: " + g);
        System.out.println("T: " + t);
        System.out.println("Distance: " + d);
    }
}