//to search in the range
public class Example1 {
    public static void main(String[] args) {
        int[] arr={1,5,2,3,7,36,234,64};
        System.out.println(linearSearch(arr,3,2,6));
    }
    static boolean linearSearch(int[] arr,int target,int r1,int r2){
        if(arr.length==0)
            return false;
        for(int i=r1;i<r2;i++){
            if(target==arr[i])
                return true;
        }
        return false;
    }
}
