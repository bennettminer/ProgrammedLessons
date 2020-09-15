import java.util.Scanner;

public class discPrice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the price of the item?");
        double price = scanner.nextDouble();

        double discount = price/10;
        double discountedPrice = price-discount;

        System.out.println("The discounted price of the item is " + discountedPrice);

    }
}