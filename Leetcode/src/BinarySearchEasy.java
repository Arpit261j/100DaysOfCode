public class BinarySearchEasy {
    public static void main(String[] args) {
        int[] nums={-1,2,4,8,9,12,45};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] num, int target) {
        int start=0,end=num.length-1;
        while(start<=end) {
            int med=start+(end-start)/2;
            if(num[med]==target) {
                return med;
            } else if(num[med]>target) {
                end=med-1;
            } else {
                start=med+1;
            }
        }
        return -1;
    }
}
