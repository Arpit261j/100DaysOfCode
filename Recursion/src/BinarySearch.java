public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,90};
        System.out.println(search(arr,90,0, arr.length-1));
    }

    static int search(int arr[],int target, int s, int e){
        if (s>e) {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target) {
            return mid;
        } else if (arr[mid]<target) {
            return search(arr,target,mid+1,e);
        } else {
            return search(arr,target,s,mid-1);
        }
    }
}
