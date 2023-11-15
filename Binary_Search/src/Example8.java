//leetcode medium question-search in sorted array.

public class Example8 {
    public static void main(String[] args) {
        int[] arr={1,3};
        int target=1;
        System.out.println(search(arr,target));
    }


    static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int mid=0,peak=0;
        if(target==nums[0]) {
            return 0;
        }
        if(nums.length==1){
            return -1;
        }
        while(start<=end) {
            mid=start+(end-start)/2;
            if(nums[mid]>nums[start]) {
                start=mid;
            } else if (nums[mid]<nums[start]) {
                end=mid-1;
            } else {
                if(nums[start]<nums[start+1]) {
                    peak=start+1;
                    break;
                }
                peak=start;
                break;
            }
        }
        int num=-1;
        if(target>nums[0]) {
            start=0;
            end=peak;
        } else {
            start=peak+1;
            end=nums.length-1;
        }
        while(start<=end) {
            mid=start+(end-start)/2;
            if(nums[mid]>target) {
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            } else {
                num=mid;
                break;
            }
        }
        return num;
    }
}

