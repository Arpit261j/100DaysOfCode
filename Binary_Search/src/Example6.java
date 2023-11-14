//leetcode question-peak index of a mountain array
public class Example6 {
    public static void main(String[] args) {
        int[] arr={3,5,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    //Kunal's Method

    static int peakIndexInMountainArray(int[] arr){
        int start=0,end=arr.length-1;
        int mid=0;
        while (start<end) {
            mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            } else {
                start=mid+1;
            }
        }
        return start;
    }

/*    static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        int mid=-1;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (mid==0) {
                start=start+1;
                continue;
            }
            if (mid==arr.length-1) {
                end=end-1;
                continue;
            }
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                return mid;
            } else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) {
                start=mid+1;
            } else  if (arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) {
                end=mid-1;
            }
        }
        return mid;
    }*/
}
