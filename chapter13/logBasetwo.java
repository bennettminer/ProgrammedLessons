import java.util.Scanner;

public class logBasetwo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double: ");
        double X = scanner.nextDouble();

        double log = Math.log(X)/Math.log(2);

        System.out.println("Base 2 log of 998.65 is " + log);
    }
}