import java.util.Scanner;

public class ohms{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is V equal to?");
        int V = scanner.nextInt();

        System.out.println("What is R equal to?");
        int R = scanner.nextInt();

        double I =  (V + 0.0 )/R;

        System.out.println("I is equal to: " + I);
    }
}