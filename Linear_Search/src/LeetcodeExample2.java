//QuestionName-Richest Customer wealth
//return the max sum of rows
public class LeetcodeExample2 {
    public static void main(String[] args) {
        int[][] arr={
                {1,3,43},
                {2,56,34,4},
                {4,64,6}
        };
        System.out.println(maxSumOfRows(arr));
    }
    static int maxSumOfRows(int arr[][]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        if(arr.length==0)
            return -1;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                sum+=arr[row][col];
            }
            if(max<sum)
                max=sum;
            sum=0;
        }
        return max;
    }
}
