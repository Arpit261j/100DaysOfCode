public class SpecialArrayWithXElements {
    public static void main(String[] args) {
        int[] arr={0,4,3,0,4};
        System.out.println(specialArray(arr));
    }
    public static int specialArray(int[] arr) {
        if(arr.length==0) {
            return 0;
        }
        int start=0,end=arr.length;
        while(start<=end) {
            int mid=start+(end-start)/2;
            int count=0;
            for(int num:arr) {
                if(num>=mid) {
                    count++;
                }
            }
            if(mid<count) {
                start=mid+1;
            } else if (mid==count) {
                return mid;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }
}
