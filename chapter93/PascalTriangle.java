public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(Pascal(3,2));
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < i+1; j++){

                System.out.println(Pascal(i, j) + " ");
            }
        }
    }

    public static int Pascal(int row, int col) {
        if (col == 0){
            return 1;
        }
        if (row == col){
            return 1;
        }
        return Pascal(row-1, col-1) + Pascal(row-1, col);
    }
}