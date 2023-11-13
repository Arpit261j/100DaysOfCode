import java.util.Scanner;


//find Square root with help of binary search algorithm
public class Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Sqrt(num));
    }
    static int Sqrt(int n){
        int mid=0;
        int start=1,end=n/2;
        while(start<=end){
            mid=start+(end-start)/2;
            //perfect square case
            if(n==mid*mid){
                return mid;
            } else if (n<mid*mid) {
                end=mid-1;
            } else if (n>mid*mid){
                start=mid+1;
            }
        }
        int t=mid-1;
        if(mid*mid>n && t*t<n)
            mid=mid-1;

        return mid;
    }
}
