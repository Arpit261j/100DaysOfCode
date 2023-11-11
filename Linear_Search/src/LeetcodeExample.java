//return how many of them contain an even number of digits
public class LeetcodeExample {
    public static void main(String[] args) {
        int arr[]={345,56,2564,433653,2345,4323,45,65,654,764,43,56,76,-98};
        System.out.println(search(arr));
    }

//    static int countNum(int num){
//        int count=0;
//        if(num<0)
//            num=num*-1;
//        while(num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
//    }


    //optimize way
    static int countNum(int num){
        if(num<0)
            num=num*-1;
        int count=(int)Math.log10(num)+1;
        return count;
    }
    static int search(int[] arr){
        int count=0;;
        if(arr.length==0)
            return -1;
        for(int i=0;i<arr.length;i++){
            int num=countNum(arr[i]);
            if(num%2==0)
                count++;
        }

        return count;
    }
}
