//return min number in an array
public class Example2 {
    public static void main(String[] args) {
        int[] arr={1,34,212,45,-34,54};
        System.out.println(linearSearch(arr));
    }
    static int linearSearch(int [] arr){
        int min=arr[0];
        if(arr.length==0)
            return Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }
}
