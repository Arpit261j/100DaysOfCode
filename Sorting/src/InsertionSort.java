import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={-22,43,-23,45,-56,-56,-34,-34,23,75,3,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j>0;j--) {
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
