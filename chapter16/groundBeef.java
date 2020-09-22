import java.util.Scanner;

public class groundBeef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price per pound Package A:");
        double poundA = scanner.nextDouble();

        System.out.println("Percent lean package A:");
        double leanA = scanner.nextDouble();

        System.out.println("Price per pound package B:");
        double poundB = scanner.nextDouble();

        System.out.println("Percent lean pacakge B:");
        double leanB = scanner.nextDouble();

        double perA = (poundA/leanA)*100;
        double perB = (poundB/leanB)*100;

        if (perA > perB){
            System.out.println("Package B is the best value.");
        }
        else {
            System.out.println("Package A is the best value");
        }
    }
}