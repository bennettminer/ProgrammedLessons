import java.util.Scanner;

public class HailstoneNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int N = scanner.nextInt();
        int i = 0;

        while (i==0){
            System.out.println(N);
            int decider = 0;
            if(N==1){
                i = i +1;
            }
            else{
                decider = N%2;
                if(decider == 0){
                    N = N/2;
                }
                else if (decider!=0){
                    N= 3*N+1;   
                }
            }
        }
    }
}