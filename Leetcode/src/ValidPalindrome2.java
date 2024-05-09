public class ValidPalindrome2 {
    public static void main(String[] args) {
        String s="abccda";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int low = 0 , high = s.length()-1 , count1 = 0 , count2 = 0;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++; high--;
            }else{
                count1++; low++;
            }
        }
        low = 0 ; high = s.length()-1;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++; high--;
            }else{
                count2++; high--;
            }
        }
        if(count1==0 || count1==1 || count2==0 || count2==1) return true;
        return false;
    }
}
