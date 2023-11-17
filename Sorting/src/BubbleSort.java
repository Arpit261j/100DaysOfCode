import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={-1,2,0,39,-75,2,99};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            for(int j=1;j<arr.length-i;j++) {
                if(arr[j]<arr[j-1]) {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

//compare 2 adjacent elements
//end the end of each loop largest element will be at end

