import java.util.Scanner;

public class SumOfSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = scanner.nextInt();

        int sum = (N*(N+1))/2;
        int i = 1;
        int loop = 0;

        while (i != 11){
            loop = loop + i;
            i = i +1;
        }

        System.out.println("Formula Sum: " + sum);
        System.out.println("Loop Sum: " + loop);

    }
}