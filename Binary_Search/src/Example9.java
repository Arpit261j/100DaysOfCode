//gfg question-find the number of rotations in a sorted array.
public class Example9 {
    public static void main(String[] args) {
        int[] arr={23,45,67,0,1,2};
        System.out.println(search(arr));
    }
    static int search(int[] nums) {
        int start = 0, end = nums.length - 1;
        int mid = 0, peak = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[start]) {
                start = mid;
            } else if (nums[mid] < nums[start]) {
                end = mid - 1;
            } else {
                if (nums[start] < nums[start + 1]) {
                    peak = start + 1;
                    break;
                }
                peak = start;
                break;
            }
        }
        if(peak==nums.length-1)
            return 0;
        return peak+1;
    }
}
