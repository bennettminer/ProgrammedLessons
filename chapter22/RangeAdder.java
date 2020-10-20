import java.util.Scanner;

public class RangeAdder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Low end of range: ");
        int lowEnd = scanner.nextInt();

        System.out.println("High end of range: ");
        int highEnd = scanner.nextInt();

        int i = 0;
        int sumOfInside;
        int sumOfOutside;

        while (i==0){
            int data = 0;

            System.out.println("Enter Data: ");
            
            if (data <= highEnd && data >= lowEnd){
                sumOfInside = sumOfInside + data;
            }
            else if(data >= highEnd || data <= lowEnd){
                sumOfOutside = sumOfOutside + data;
            }
            else if(data == 0){
                System.out.println("Sum of in Range values: " + sumOfInside);
                System.out.println("Sum of out of Range values: " + sumOfOutside);
                i = i + 1;
            }
        }
    }
}