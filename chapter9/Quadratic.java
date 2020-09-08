public class Quadratic{
    public static void main(String[] args) {
        double a = 3, b = -8, c = 4;
        double root, root2;

        double determinant = b * b - 4 * a * c;

        root = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        System.out.println("X is " + root + " and " + root2);
    }
}