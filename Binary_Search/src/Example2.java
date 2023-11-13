import java.util.Scanner;

//Ceiling of a number
//floor of a number
public class Example2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,14,16,18};
        int target=15;
        System.out.println(Ceiling(arr,target));
        System.out.println(Floor(arr,target));
    }

//Kunal's method
    static int Ceiling(int[] arr, int target){
        if(arr.length==0)
            return -1;
        int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if(target==arr[mid]) {
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int Floor(int[] arr, int target){
        if(arr.length==0)
            return -1;
        int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if(target==arr[mid]) {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
