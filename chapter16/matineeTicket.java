import java.util.Scanner;

public class matineeTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is the time?");
        int time = scanner.nextInt();

        if (age >= 13){
            //adult
            if (time <= 1700){
                //matinee
                System.out.println("Your ticket is 5 dollars.");
            }
            else{
                //normal
                System.out.println("Your ticket is 8 dollars.");
            }
        }
        else{
            //child 
            if (time <= 1700){
                //matinee
                System.out.println("Your ticket is 2 dollars.");
            }
            else{
                //normal
                System.out.println("Your ticket is 4 dollars.");
            }
        }
    }
}