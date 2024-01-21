import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(rotate(arr,4)));
    }
    public static void reverse(int[] nums,int i, int j) {
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        return nums;
    }
}
