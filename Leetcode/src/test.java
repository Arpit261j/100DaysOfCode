import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,4,3,9,5};
        int[] res = new int[arr.length];
        res[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            res[i]=Math.max(res[i],arr[i+1]);
        }
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++) {
            set.add(arr[i]);
            
        }
    }

}
