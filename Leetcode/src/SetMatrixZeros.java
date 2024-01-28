public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for(int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
