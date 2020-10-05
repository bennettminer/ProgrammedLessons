import java.util.Random;

public class SnakeEyes {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        //counters
        int i = 0;
        int x = 0;

        //max possible roll
        int max = 12;
        
        //the score of the player
        int score = 0;

        //the amount of time the simulation will happen
        int times = 10;

        while (x!=times){
            i = 0;
            score = 0;
            while (i==0){
                int n = randomGenerator.nextInt(max);

                if (n != 2){
                    i = 0;
                    score = score + n;
                }
                else {
                    i = i + 1;
                    System.out.println("----\n" + score);
                }
            }
            x = x + 1;
            System.out.println(x);
        }
    }
}