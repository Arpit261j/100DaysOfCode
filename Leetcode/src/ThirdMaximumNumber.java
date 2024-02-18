public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Integer max = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max) || n.equals(max2) || n.equals(max3)) continue;
            if (max == null || n > max) {
                max3 = max2;
                max2 = max;
                max = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max : max3;
    }
}
