import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        int m = matrix.length, n = matrix[0].length;
        int rowSt = 0, colSt = 0, rowEnd = m - 1, colEnd = n - 1;
        while(list.size() < m * n){
            //For starting row addition
            for(int i = colSt; i <= colEnd; i++){
                list.add(matrix[rowSt][i]);
            }

            //To add last colm
            for(int i = rowSt + 1; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            //To add last row
            if(rowSt != rowEnd){
                for(int i = colEnd - 1; i >= colSt; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            //To add first colm
            if(colSt != colEnd){
                for(int i = rowEnd - 1; i >= rowSt + 1; i--){
                    list.add(matrix[i][colSt]);
                }
            }
            colSt++;
            colEnd--;
            rowSt++;
            rowEnd--;
        }
        return list;
    }
}
