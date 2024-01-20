import java.util.*;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr={-1,2,1,-4};
        System.out.println(threeSumClosest(arr,1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=0;i<nums.length-2;i++) {
            int j=i+1,k=nums.length-1;
            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) {
                    return sum;
                } else if (sum<target) {
                    if((target-sum)<min) {
                        min=target-sum;
                        ans=sum;
                    }
                    j++;
                } else {
                    if((sum-target)<min) {
                        min=sum-target;
                        ans=sum;
                    }
                    k--;
                }
            }
        }
        return ans;
    }
}
