public class Main {
    public static void main(String[] args) {

        int nums[]={2,54,36,4567,234,657};
        int target=234;
        String name="Arpit";
        char ch='t';

        System.out.println(linearSearch(nums,target));
        System.out.println(stringLinearSearch(name,ch));
    }


    static boolean stringLinearSearch(String arr, int target){
        if(arr.length()==0)
            return false;
        for(int i=0;i<arr.length();i++){
            if(target==arr.charAt(i))
                return true;
        }
        return false;
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i])
                return target;
        }
        return -1;
    }
}