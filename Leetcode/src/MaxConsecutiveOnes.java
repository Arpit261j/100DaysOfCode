public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maximum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                maximum=Math.max(maximum,count);
            }
            else{
                count=0;
            }
        }
        return maximum;

    }
}
