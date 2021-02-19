public class Triangle{

    int num;

    Triangle(int N){
        num = N;
    }

    public int TriangleCalc(){
        if (num == 1){
            return 1;
        }
        else{
            return num + (num-1);
        }
    }
}