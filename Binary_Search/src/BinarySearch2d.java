import java.util.Arrays;

//array will be sorted row wise and column wise.
public class BinarySearch2d {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,47},
                {33,34,38,50}
        };
        int target=1;
        System.out.println(Arrays.toString(binarySearch2d(arr,target)));
    }

    //start search from row 0 and last column
    //1. if value>target col--
    //2. if value<target row++

    static int[] binarySearch2d(int[][] arr, int target){
        int row=0;
        int col=arr.length-1;
        while(row<=arr.length && col>=0) {
            if(arr[row][col]==target) {
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}
