import java.util.Scanner;

public class WeekTemp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was the temperature for Sunday?");
        int sunTemp = scanner.nextInt();

        System.out.println("What was the temperature for Monday?");
        int monTemp = scanner.nextInt();

        System.out.println("What was the temperature for Tuesday?");
        int twoTemp = scanner.nextInt();

        System.out.println("What was the temperature for Wednesday?");
        int wedTemp = scanner.nextInt();

        System.out.println("what was the temperature for Thursday?");
        int thurTemp = scanner.nextInt();

        System.out.println("What was the temperature for Friday?");
        int friTemp = scanner.nextInt();

        System.out.println("What was the temperature for Saturday?");
        int satTemp = scanner.nextInt();

        int avgTemp = (sunTemp + monTemp + twoTemp + wedTemp + thurTemp + friTemp + satTemp)/7;
        
        System.out.println("---------------------------\n| S | M | T | W | T | F | S |\n| " + sunTemp + "   " + monTemp + "   " + twoTemp + "   " + wedTemp +  "   " + thurTemp + "   " + friTemp + "   " + satTemp + " |");
        System.out.println("The average temperature of the week was: " + avgTemp);

    }
}