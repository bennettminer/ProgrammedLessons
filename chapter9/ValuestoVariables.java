import java.util.Scanner;

public class ValuestoVariables{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is x equal to? (provide 2 values)");
        double x = scanner.nextDouble();

        System.out.println("Another:");
        double x2 = scanner.nextDouble();

        double b = x + x2;

        double c = x * x2;
        System.out.println("b is: " + b + " c is: " + c);
        System.out.println("x^2+" + b + "x+" + c + "=0" );

    }
}