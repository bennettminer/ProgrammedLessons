import java.util.Scanner;

public class subStringfun{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();

        System.out.println("Enter a beginning index: ");
        int beginningIndex = scanner.nextInt();

        System.out.println("Enter a ending index: ");
        int endingIndex = scanner.nextInt();

        String newString = originalString.substring( beginningIndex, endingIndex );

        System.out.println("Original String: \n" + originalString);

        System.out.println("New String: \n" + newString);

    }
}