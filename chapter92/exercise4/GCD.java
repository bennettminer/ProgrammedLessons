public class GCD{
    public static void main(String[] args) {
        System.out.println(gcd(6,9)); //3
    }

    public static int gcd(int A, int B){
        if (A==0){
            return B;
        }
        return gcd(B%A, A);
    }
}