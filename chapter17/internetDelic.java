import java.util.Scanner;

public class internetDelic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item:");
        String item = scanner.nextLine();

        System.out.println("Enter the price:");
        double price = scanner.nextDouble();

        System.out.println("Express Delivery? (0=no, 1=yes)");
        boolean deliv = scanner.nextBoolean();

        double delivery = 0;

        if (price <= 2.0){
            delivery = 2;

            if (deliv = true){
                delivery = delivery + 3;
            }
            else {
                
            }
        }
        else{
            double delivePrice = 0.0;
        }

        double invoice = price + delivery;

        System.out.println("Invoice:\n " + item + " " + price + "0\n" + "delivery " + delivery + "0\n" + "total " + invoice + "0\n");
    }
}