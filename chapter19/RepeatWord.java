import java.util.Scanner;

public class RepeatWord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        int times;
        int i = 0;
        times = word.length();

        while (i != times + 1){
            System.out.println(word);

            i = i + 1;
        }



    }
}