//find missing number-leetcode question
import java.util.Arrays;

public class CycleSortExample1 {
    public static void main(String[] args) {
        int[] arr={1,0,3,5,2};
        System.out.println(missingNum(arr));
    }
    static void swap(int[] arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static int missingNum(int[] arr){
        int i=0;
        while(i<arr.length) {
            if(arr[i]==arr.length) {
                i++;
                continue;
            }
            int correctIndex=arr[i];
            if(i==correctIndex) {
                i++;
            } else {
                swap(arr,i,correctIndex);
            }
        }
        for(int j=0;j<arr.length;j++) {
            if(arr[j]!=j) {
                return j;
            }
        }
        return arr.length;
    }

}
