import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,4,12,0,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++) {
            nums[i]=0;
        }
    }
}
