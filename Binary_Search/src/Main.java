public class Main {
    public static void main(String[] args) {
        int[] arr={-43,-32,-3,31,35,65,246,7642};
        System.out.println(binarySearch(arr,7642));
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
//          int mid=start+end/2;      //(start+end)/2 may exceed int maximum value
            int mid=start+(end-start)/2;    //  it will be equal to start+end/2
            if(arr[mid]>target)
                end=mid-1;
            else if(arr[mid]<target)
                start=mid+1;
            else
                return mid;

        }
        return -1;
    }
}