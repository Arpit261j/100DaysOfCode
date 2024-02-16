import java.util.*;
public class NextGreaterELement1 {
    public static void main(String[] args) {
        int nums1[]={4,1,2};
        int[] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<nums1.length;i++) {
            count=0;
            for(int j=0;j<nums2.length-1;j++) {
                if(nums1[i]==nums2[j]) {
                    int max=nums2[j];
                    for(int k=j+1;k<nums2.length;k++) {
                        if(max<nums2[k]) {
                            ans.add(nums2[k]);
                            count+=1;
                            break;
                        }
                    }
                }
            }
            if(count==0) {
                ans.add(-1);
            }
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}
