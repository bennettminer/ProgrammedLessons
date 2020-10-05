import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low:");
        int low = scanner.nextInt();

        System.out.println("Enter high:");
        int high = scanner.nextInt();

        int i = low;
        int loop = 0;

        while (i != high + 1){
            loop = loop + i;
            i = i +1;
        }

        System.out.println("Sum: " + loop);
    }
}