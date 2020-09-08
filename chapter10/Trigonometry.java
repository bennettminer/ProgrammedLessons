public class Trigonometry{
    public static void main(String[] args) {
        double value = 0.425;

        double sinx = Math.sin(value);
        double cosx = Math.cos(value);

        double sum = sinx + cosx;

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
    }
}