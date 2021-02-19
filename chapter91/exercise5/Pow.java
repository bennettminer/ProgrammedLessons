public class Pow{
    Pow(){
    }

    public static int PowCalc(int N){
        if (N == 0){
            return 1;
        }
        else{
            return (2*PowCalc(N-1));
        }
    }
}