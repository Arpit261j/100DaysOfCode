public class MaximumProductSubArray {
    public static void main(String[] args) {
        int [] arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int mulL=1,mulR=1,ans=nums[0];
        for(int i=0;i<nums.length;i++) {

            mulL= mulL==0 ? 1 : mulL;
            mulR= mulR==0 ? 1 : mulR;

            mulL=mulL*nums[i];
            mulR=mulR*nums[nums.length-1-i];
            if(ans<mulL || ans<mulR) {
                ans=mulL>mulR ? mulL : mulR;
            }
        }
        return ans;
    }
}
