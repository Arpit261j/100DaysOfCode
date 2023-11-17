import java.util.Arrays;

public class BinarySearch2dExample2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=12;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    //normal binary search in provided row and between provided columns
    static  int[] binarySearch(int[][] arr, int row, int col1, int col2 , int target){
        while(col1<=col2){
            int mid=col1+(col2-col1)/2;
            if(arr[row][mid]==target) {
                return new int[]{row,mid};
            } else if(target>arr[row][mid]) {
                col1=mid+1;
            } else {
                col2=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;   //suppose if only 1 row is there in matrix;
        if(row==1) {
            return binarySearch(matrix, 0,0,matrix[0].length-1,target);
        }

        //run the loop till 2 rows are remaining
        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStart<(rEnd-1)) {
            int rMid=rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target) {
                return new int[]{rMid,cMid};
            } else if (matrix[rMid][cMid]>target){
                rEnd=rMid;
            } else {
                rStart=rMid;
            }
        }
        //now we have 2 rows
        //check whether we have target in these 2 rows in columns
        if(matrix[rStart][cMid]==target) {
            return new int[]{rStart,cMid};
        }
        if(matrix[rEnd][cMid]==target) {
            return new int[]{rEnd,cMid};
        }

        //Search in 1st half
        if(target<=matrix[rStart][cMid-1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        //Search in 2nd half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1]) {
            return binarySearch(matrix, rStart, cMid + 1, matrix[rStart].length - 1, target);
        }
        //Search in 3rd half
        if(target<=matrix[rEnd][cMid-1]) {
            return binarySearch(matrix, rEnd, 0, cMid-1, target);
        }
        //Search in 4th half
        if(target>=matrix[rEnd][cMid+1]) {
            return binarySearch(matrix, rEnd, cMid + 1, col-1, target);
        }
        return new int[]{-1,-1};
    }
}
