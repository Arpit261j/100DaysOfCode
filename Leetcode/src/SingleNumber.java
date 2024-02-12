public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
        int num1=nums[0];
        for(int i=1;i<nums.length;i++) {
            num1=num1^nums[i];
        }
        return num1;
    }
}
