import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4,6,7,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void swap(int[] arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length-1) {
            int correctIndex=arr[i]-1;
            if(i==correctIndex) {
                i++;
            } else {
                swap(arr,i,correctIndex);
            }
        }
    }


    /*static void sort(int[] arr){
        int correctIndex;
        for(int i=0;i<arr.length-1;i++) {
            while(true) {
                correctIndex=arr[i]-1;
                if(i==correctIndex) {
                    break;
                } else {
                    swap(arr,i,correctIndex);
                }
            }
        }
    }*/
}
