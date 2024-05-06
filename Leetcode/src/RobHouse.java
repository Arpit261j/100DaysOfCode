public class RobHouse {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] arr) {
        if(arr.length==1) {
            return arr[0];
        }
        if(arr[0]>arr[1]) {
            arr[1]=arr[0];
        }
        if(arr.length==2) {
            int i=0;
            if(arr[i]>arr[i+1]) {
                return arr[i];
            } else {
                return arr[i+1];
            }
        }
        int i=2;
        while(i<arr.length) {
            if(arr[i-1]>arr[i]+arr[i-2]) {
                arr[i]=arr[i-1];
            } else {
                arr[i]=arr[i]+arr[i-2];
            }
            i++;
        }
        return arr[arr.length-1];
    }
}
