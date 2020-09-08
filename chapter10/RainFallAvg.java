public class RainFallAvg{
    public static void main(String[] args) {
        long rainAp = 12;
        long rainMay = 14;
        long rainJne = 8;

        double avgRain = (rainAp + rainMay + rainJne)/3;

        System.out.println("Rainfall for April: " + rainAp + "\nRainfall for May: " + rainMay + "\nRainfall for June: " + rainJne + "\nAverage rainfall: " + avgRain);
    }
}