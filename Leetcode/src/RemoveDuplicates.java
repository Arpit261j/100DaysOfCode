//Easy-Remove duplicates from sorted array.
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int correctIndex=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                nums[correctIndex]=nums[i];
                correctIndex++;
            }
        }
        return correctIndex;
    }
}
