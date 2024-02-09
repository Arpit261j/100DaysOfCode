import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int [] arr2={4,5,6};
        System.out.println(Arrays.toString(merge(arr1,3,arr2,3)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<m;i++) {
            arr.add(nums1[i]);
        }
        for(int i=0;i<n;i++) {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        int[] arr1=new int[arr.size()];
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=arr.get(i);
        }
        return arr1;
    }
}
