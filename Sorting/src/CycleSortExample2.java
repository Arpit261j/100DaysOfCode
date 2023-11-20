//leetcode medium question-find duplicate number.
public class CycleSortExample2 {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correctIndex=nums[i]-1;
            if(i==correctIndex) {
                i++;
            } else {
                if(nums[i]==nums[correctIndex]) {
                    return nums[i];
                }
                swap(nums,i,correctIndex);
            }
        }
        return -1;
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
