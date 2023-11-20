//leetcode hard question- 41. First Missing Positive
public class CycleSortExample3 {
    public static void main(String[] args) {
        int[] arr={1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int max=nums[0];
        for(int j=0;j<nums.length;j++) {
            if(nums[j]>max) {
                max=nums[j];
            }
        }
        int i=0;
        while(i<nums.length) {
            int correctIndex=nums[i]-1;
            if(nums[i]<=0 || nums[i]>nums.length-1) {
                i++;
                continue;
            }
            if(i==correctIndex) {
                i++;
            } else {
                if (nums[i]==nums[correctIndex]) {      //if numbers are repeated
                    i++;
                    continue;
                }
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j+1) {
                return j+1;
            }
        }
        return max+1;
    }
}
