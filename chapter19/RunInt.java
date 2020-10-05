import java.util.Scanner;

public class RunInt{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = scanner.nextInt();
        System.out.println("Enter End:");
        int end = scanner.nextInt();

        int i = start;

        while (i != end + 1){
            System.out.println(i);
            i = i + 1;
        }
    }
}
    
