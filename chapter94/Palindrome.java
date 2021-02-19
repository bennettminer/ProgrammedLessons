public class Palindrome{
    public static void main(String[] args) {
        System.out.println(Palindromer("racer"));
    }

    public static boolean Palindromer(String String){
        if (String.length() <= 1){
            return true;
        }
        return String.charAt(0) == String.charAt(String.length()-1) && Palindromer(String.substring(1, String.length()-1));
    }
}