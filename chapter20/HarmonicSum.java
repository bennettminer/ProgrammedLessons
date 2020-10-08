import java.util.Scanner;

public class HarmonicSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int N = scanner.nextInt();
        int i = 1;
        double denominator = 1.0;
        double addition = 0.0;
        double sum = 0.0;

        while(i<=N){
            addition = 0;
            addition = 1.0/denominator;
            sum = addition + sum;
            i = i + 1;
            denominator = denominator + 1.0;
        }
        System.out.println(sum);
    }
}