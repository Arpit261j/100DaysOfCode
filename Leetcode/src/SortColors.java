import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={1,2,2,0};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
    public static int[] sortColors(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}
