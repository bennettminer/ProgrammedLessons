import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);

        //counters
        int i = 0;
        int x = 0;

        //max possible roll
        int max = 12;
        
        //the score of the player
        int score = 0;
        int avgScore = 0;
        int finalScore = 0;

        //the rolls of the player
        int rolls = 0;
        int avgRolls = 0;
        int finalRoll = 0;
        int moreThanFour = 0;
        int lessThanFour = 0;

        //the amount of time the simulation will happen
        System.out.println("How many times do you want to run the simulation?");
        int times = scanner.nextInt();

        while (x!=times){
            i = 0;
            score = 0;
            rolls = 0;
            while (i==0){
                int n = randomGenerator.nextInt(max);

                if (n != 2){
                    i = 0;
                    score = score + n;
                    rolls = rolls + 1;

                }
                else {
                    i = i + 1;
                    finalRoll = rolls + finalRoll;
                    finalScore = score + finalScore;
                    if (rolls > 4){
                        moreThanFour = moreThanFour + 1;
                    }
                    else {
                        lessThanFour = lessThanFour + 1;
                    }
                }
            }
            x = x + 1;
        }
        avgRolls = finalRoll/times;
        avgScore = finalScore/times;
        double perc = (moreThanFour/times)*1.0;
        double calcFour = perc*10;
        System.out.println("Average number of rolls: " + avgRolls);
        System.out.println("Average score of the player: " + avgScore);
        System.out.println("Percentage of players rolling over 4: " + calcFour);
    }
}