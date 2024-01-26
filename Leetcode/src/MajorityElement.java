import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length)/2];
    }
}
