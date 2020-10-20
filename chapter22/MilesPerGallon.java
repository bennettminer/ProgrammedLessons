import java.util.Scanner;

public class MilesPerGallon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Miles Per Gallon Program");

        int i = 0;

        
        while (i>=0){
            int milesPerGallon = 0;
            int intialMiles = 0;
            int finalMiles = 0;
            int gallons = 0;

            System.out.println("Initial miles:");
            intialMiles = scanner.nextInt();
            if (intialMiles>=1){
                System.out.println("Final miles:");
                finalMiles = scanner.nextInt();
        
                System.out.println("Gallons:");
                gallons = scanner.nextInt();

                milesPerGallon = (finalMiles-intialMiles)/gallons;

                System.out.println("Miles Per Gallon: " + milesPerGallon);
            }
            else {
                System.out.println("bye");
                i = i - 1;
            }
        }





    }
}