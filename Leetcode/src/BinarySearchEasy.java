public class BinarySearchEasy {
    public static void main(String[] args) {
        int[] nums={-1,2,4,8,9,12,45};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end) {
            int med=start+(end-start)/2;
            if(nums[med]==target) {
                return med;
            } else if(nums[med]>target) {
                end=med-1;
            } else {
                start=med+1;
            }
        }
        return -1;
    }
}
