public class LongestSubarrayOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int l=0,r=0,ans=0,count=0;
        for(;r<nums.length;r++) {
            if(nums[r]==0) {
                count++;
            }
            for(;count>1;l++) {
                if(nums[l]==0){
                    count--;
                }
            }
            if(ans<(r-l+1)) {
                ans=r-l;
            }
        }
        return ans;
    }
}
