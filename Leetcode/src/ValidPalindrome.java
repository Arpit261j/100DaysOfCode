public class ValidPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str) {
        str=str.toLowerCase();
        str=str.replaceAll("[^a-zA-Z0-9]","");
        int start=0,end=str.length()-1;
        while(start<=end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
