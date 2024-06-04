public class LongestPalindrome {
    public static void main(String[] args) {
        String s="cccc";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int[] char_counts=new int[128];
        for(char c : s.toCharArray()) {
            char_counts[c]++;
        }

        int result=0;
        for(Integer char_count : char_counts) {
            result+=char_count / 2 * 2;
            if(result % 2 == 0 && char_count % 2 ==1) {
                result += 1;
            }
        }
        return result;
    }
}
