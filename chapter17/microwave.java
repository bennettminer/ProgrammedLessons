import java.util.Scanner;

public class microwave{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many items to heat:");
        int items = scanner.nextInt();

        System.out.println("Time for one item:");
        int time = scanner.nextInt();

        int seconds = 0;
        int minutes = 0;

        if (items == 1){
            seconds = time%100;
            minutes = time-seconds;
        }
        else if (items == 2){
            seconds = time%100;
            minutes = time-seconds;

            int addedsec = seconds/2;
            
            seconds = seconds+addedsec;
        }
        else if (items == 3){
            seconds = time%100;
            minutes = time-seconds;

            seconds = seconds*2;
            minutes = minutes*2;
        }

        System.out.println("Heat for " + minutes + " minutes " + seconds + " seconds.");
    }
}