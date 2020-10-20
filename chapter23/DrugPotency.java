public class DrugPotency{
    public static void main(String[] args) {
        double effect = 100.0;
        int i = 0;
        System.out.println("month: " + i + " effectiveness: " + effect);
        while (effect>=50){
            effect = ((effect*.04)-effect)*-1.0;
            i = i + 1;

            System.out.println("month: " + i + " effectiveness: " + effect);
        }
    }
}