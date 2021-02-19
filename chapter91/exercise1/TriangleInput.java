import java.util.Scanner;

public class TriangleInput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rows are there?");
        int number = scanner.nextInt();

        Triangle tri = new Triangle(number);
        System.out.println(tri.TriangleCalc());
    }
}