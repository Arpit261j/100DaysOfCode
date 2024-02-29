public class ApreceedsB {
    public static void main(String[] args) {
        String s="aab";
        System.out.println(solution(s));
    }
    public static boolean solution(String s) {
        int num=0;
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='b') {
                num=i;
                count=1;
                break;
            }
        }
        if(count==0) {
            return true;
        }
        for(int i=s.length()-1;i>num;i--) {
            if(s.charAt(i)=='a') {
                return false;
            }
        }
        return true;
    }
}
