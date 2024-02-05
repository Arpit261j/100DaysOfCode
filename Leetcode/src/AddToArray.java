import java.util.*;
public class AddToArray {
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        System.out.println(addToArrayForm(arr,34));
    }
    public static List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> num1 = new ArrayList<>();
        int i=num.length-1;

        while(i>=0 || k>0){
            if(i>=0){
                num1.add((num[i]+k)%10);
                k=(num[i]+k)/10;
                i--;
            }
            else{
                num1.add(k%10);
                k=k/10;
            }}

        Collections.reverse(num1);
        return num1;
    }
}
