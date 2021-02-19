import java.util.Scanner;

public class MedievalTimes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("What is the name of your game?");
        String game = scanner.nextLine();

        System.out.println("What is the name of your first character?");
        String name1 = scanner.nextLine();
        System.out.println("What is the name of your next character?");
        String name2 = scanner.nextLine();
        System.out.println("What is the name of your next character?");
        String name3 = scanner.nextLine();
        System.out.println("What is the name of your last character?");
        String name4 = scanner.nextLine();
        Character firstCharacter = new Character(name1);
        Character secondCharacter = new Character(name2);
        Character thirdCharacter = new Character(name3);
        Character fourthCharacter = new Character(name4);

        System.out.println("What type of character is your first character?");
        String class1 = scanner.nextLine();
        while (i==0){
            if (class1.equals("Peasant") || class1.equals("Knight") || class1.equals("Cleric") || class1.equals("Mage") || class1.equals("Courtier")){
                i = i + 1;
            }
            else {
                System.out.println("Try again!");
                System.out.println("What type of character is your first character?");
                class1 = scanner.nextLine();
            }
        }

        i = 0;
        System.out.println("What type of character is your next character?");
        String class2 = scanner.nextLine();
        while (i==0){
            if (class2.intern  != (class1) && class2.equals("Peasant") || class2.equals("Knight") || class2.equals("Cleric") || class2.equals("Mage") || class2.equals("Courtier")){
                i = i + 1;
            }
            else {
                System.out.println("Try again!");
                System.out.println("What type of character is your next character?");
                class2 = scanner.nextLine();
            }
        }

        i = 0;
        System.out.println("What type of character is your next character?");
        String class3 = scanner.nextLine();
        while (i==0){
            if (class3.equals("Peasant") || class3.equals("Knight") || class3.equals("Cleric") || class3.equals("Mage") || class3.equals("Courtier")){
                i = i + 1;
            }
            else {
                System.out.println("Try again!");
                System.out.println("What type of character is your next character?");
                class3 = scanner.nextLine();
            }
        }

        i = 0;
        System.out.println("What type of character is your last character?");
        String class4 = scanner.nextLine();
        while (i==0){
            if (class4.equals("Peasant") || class4.equals("Knight") || class4.equals("Cleric") || class4.equals("Mage") || class4.equals("Courtier")){
                i = i + 1;
            }
            else {
                System.out.println("Try again!");
                System.out.println("What type of character is your last character?");
                class4 = scanner.nextLine();
            }
        }

        firstCharacter.setType(class1);
        System.out.println("Your stats are: ");
        System.out.println(firstCharacter.getStats());
        System.out.println(firstCharacter.getStrength());
        System.out.println(firstCharacter.getToughness());
        System.out.println(firstCharacter.getIntelligence());
        System.out.println(firstCharacter.getMagic());
        System.out.println(firstCharacter.getInfluence());
        System.out.println("--------");

        secondCharacter.setType(class2);
        System.out.println(secondCharacter.getStats());
        System.out.println(secondCharacter.getStrength());
        System.out.println(secondCharacter.getToughness());
        System.out.println(secondCharacter.getIntelligence());
        System.out.println(secondCharacter.getMagic());
        System.out.println(secondCharacter.getInfluence());
        System.out.println("--------");

        thirdCharacter.setType(class3);
        System.out.println(thirdCharacter.getStats());
        System.out.println(thirdCharacter.getStrength());
        System.out.println(thirdCharacter.getToughness());
        System.out.println(thirdCharacter.getIntelligence());
        System.out.println(thirdCharacter.getMagic());
        System.out.println(thirdCharacter.getInfluence());
        System.out.println("--------");

        fourthCharacter.setType(class4);
        System.out.println(fourthCharacter.getStats());
        System.out.println(fourthCharacter.getStrength());
        System.out.println(fourthCharacter.getToughness());
        System.out.println(fourthCharacter.getIntelligence());
        System.out.println(fourthCharacter.getMagic());
        System.out.println(fourthCharacter.getInfluence());
        System.out.println("--------");
    }
}