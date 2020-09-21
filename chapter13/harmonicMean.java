import java.util.Scanner;

public class harmonicMean{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X: ");
        double x = scanner.nextDouble();

        System.out.println("Enter Y: ");
        double y = scanner.nextDouble();

        double X = 1/x;

        double Y = 1/y;

        double H = 2/(X+Y);

        double A = (x+y)/2;

        System.out.println("Arithmetic mean: " + A);

        System.out.println("Harmonic mean: " + H);
    }
}