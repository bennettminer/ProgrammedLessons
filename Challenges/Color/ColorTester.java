public class ColorTester{
    public static void main(String[] args) {
        Color firstColor = new Color();

        System.out.println(firstColor.getRed());
        System.out.println(firstColor.getGreen());
        System.out.println(firstColor.getBlue());
        System.out.println("--------------");

        firstColor.setRed(255);
        firstColor.setGreen(250);
        firstColor.setBlue(245);
        System.out.println("[" + firstColor.r + ", " + firstColor.g + ", " + firstColor.b + "]");
        System.out.println("--------------");
    
        firstColor.randomRed();
        firstColor.randomBlue();
        firstColor.randomGreen();
        System.out.println("[" + firstColor.r + ", " + firstColor.g + ", " + firstColor.b + "]");
        System.out.println("--------------");

        System.out.println("[" + firstColor.r + ", " + firstColor.g + ", " + firstColor.b + "]");
        System.out.println("--------------");

        firstColor.setRed(0);
        firstColor.setGreen(0);
        firstColor.setBlue(0);
        firstColor.lighten(10);
        System.out.println(firstColor.getChangedRed());
        System.out.println(firstColor.getChangedGreen());
        System.out.println(firstColor.getChangedBlue());
        System.out.println("--------------");
        firstColor.darken(10);
        System.out.println(firstColor.getChangedRed());
        System.out.println(firstColor.getChangedGreen());
        System.out.println(firstColor.getChangedBlue());
    }
}