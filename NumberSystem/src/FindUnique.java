public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,5,6,1,2,3,1,4};
        System.out.println(findUniqueNum(arr));
    }

     static int findUniqueNum(int[] arr) {
        int num=arr[0];
        for(int i=1;i<arr.length;i++) {
            num=num^arr[i];
        }
        return num;
    }

}
