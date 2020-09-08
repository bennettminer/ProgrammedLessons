public class DegreesToRadians{
    public static void main(String[] args) {
        long degrees = 30;

        double rad = degrees * Math.PI/180;

        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);

        double sum = sinx + cosx;

        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum);
    }
}