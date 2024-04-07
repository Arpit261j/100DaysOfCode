public class JumpGame2 {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,1};
        System.out.println(jump(arr));
    }
    public static int jump(int[] nums) {
        int i=0,maxI=0;
        int count=0;
        int end=nums.length-1;
        while(i!=end) {
            int max=-1;
            if(i+nums[i]>=end) {
                count++;
                return count;
            }
            for(int j=i+1;j<=i+nums[i];j++) {
                if(max<=nums[j]) {
                    max=nums[j];
                    maxI=j;
                }
            }
            i=maxI;
            count++;
        }
        return 0;
    }
}
