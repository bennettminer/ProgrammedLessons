import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the radius of the circle?");
        int radius = scanner.nextInt();
        
        double area = (radius * radius) * Math.PI;

        System.out.println("The area of the circle is: " + area);
        
    }
}