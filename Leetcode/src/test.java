import java.util.ArrayList;
import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] s={-1,0,1,2,-1,-4};
        System.out.println(threeSum(s));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int k=0;k<nums.length-2;k++) {
            if(k>0 && nums[k]==nums[k-1]) {
                continue;
            }
            int i=k+1,j=nums.length-1;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    ans.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    while(i<j && nums[i]==nums[i+1]) {
                        i++;
                    }
                    while(i<j && nums[j]==nums[j-1]) {
                        j--;
                    }
                    i++;
                    j--;
                } else if (sum>0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return ans;
    }
}
