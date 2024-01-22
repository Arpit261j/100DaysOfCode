import java.util.Arrays;

//Medium-Product of Array Except self.
public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,1,9};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int prod=1,count=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                count+=1;
                continue;
            }
            prod*=nums[i];
        }
        if(count>1) {
            return new int[nums.length];
        }
        for(int i=0;i<nums.length;i++) {
            if(count>0) {
                if(nums[i]==0) {
                    nums[i]=prod;
                    continue;
                }
                nums[i]=0;
                continue;
            }
            nums[i]=prod/nums[i];
        }
        return nums;
    }
}
