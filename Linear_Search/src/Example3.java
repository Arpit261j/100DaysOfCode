import java.util.Arrays;

//Search in 2D array
public class Example3 {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,43},
                {2,53,46,75,34,54},
                {4,643,65}
        };
        int target=4;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0)
            return new int[]{-1,-1};
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col])
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
