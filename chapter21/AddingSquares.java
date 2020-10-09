import java.util.Scanner;

public class AddingSquares{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the upper limit?");
        int n = scanner.nextInt();
        int i = 1;
        int multip = 1;
        int square = 0;
        int sum = 0;

        while (i != n+1){
            sum = 0;
            sum = multip*multip;
            square = sum + square;
            i = i +1;
            multip = multip + 1;
        }

        System.out.println("The sum of squares is: " + square);
        i = 1;
        multip = 1;
        int cube = 0;

        while (i != n+1){
            sum = 0;
            sum = multip*multip*multip;
            cube = sum + cube;
            i = i +1;
            multip = multip + 1;
        }

        System.out.println("The sum of cubes is: " + cube);
    }
}