import java.util.Scanner;

public class Modulus{
    public static void main(String[] args) {
        int A = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is M equal to?");
        int M = scanner.nextInt();
        System.out.println("What is A equal to?");
        int previousA = 1;
        while (A != previousA){
            previousA = A;
            A = scanner.nextInt();
            System.out.println(ModulusTest(A, M));
            System.out.println("What is A equal to?");
        }
    }

    public static int ModulusTest(int A, int M){
        if (A >= 0 && A < M){
            return A;
        }
        if (A >= M){
            return ModulusTest(A-M, M);
        }
        if (A < 0){
            return ModulusTest(A+M, M);
        }
        return 0;
    }
}