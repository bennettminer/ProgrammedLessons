public class BoxTester{
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);



        System.out.println(box.Area() + box.Volume());

        System.out.println(box.length + box.height + box.width);
    }
}