import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,-98,97,-759,-98};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }
    }
    static void swap(int arr[],int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int getMaxIndex(int[] arr,int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++) {
            if(arr[i]>arr[max]) {
                max=i;
            }
        }
        return max;
    }
}
