import java.util.Scanner;

public class SepDots{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String word1 = scanner.nextLine();
        System.out.println("Enter another word:");
        String word2 = scanner.nextLine();

        int length1 = word1.length();
        int length2 = word2.length();

        int charCount = length1 + length2;
        int i = charCount;
        String period = "";

        while (i != 31){
            i = i +1;
        }
    }
}