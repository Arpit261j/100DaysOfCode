import java.util.Arrays;

//leetcode question-find first and last position of an element
public class Example4 {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,7,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }
     static int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        arr[0]=firstOccurence(nums,target);
        arr[1]=lastOccurence(nums,target);
        return arr;
    }
    static int firstOccurence(int[] nums,int target){
        int start=0,end=nums.length-1;
        int mid=0;
        int occurence=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==nums[mid]) {
                occurence=mid;
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return occurence;
    }
    static int lastOccurence(int[] nums,int target){
        int start=0,end=nums.length-1;
        int mid=0;
        int occurence=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==nums[mid]) {
                occurence=mid;
                start=mid+1;
            } else if (target>nums[mid]) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return occurence;
    }
}
