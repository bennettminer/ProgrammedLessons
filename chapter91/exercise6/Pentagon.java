public class Pentagon{
    Pentagon(){

    }

    public static int PentagonTest(int N){
        if (N == 1){
            return 1;
        }
        else{
            return (N*(3*(PentagonTest(N-1))))/2;
        }
    }
}