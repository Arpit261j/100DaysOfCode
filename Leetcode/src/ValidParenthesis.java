public class ValidParenthesis {
    public static void main(String[] args) {
        String s="{}()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s.length()%2!=0) {
            return false;
        }
        int count=0;
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)=='}') {
                if(s.charAt(i-1)!='{') {
                    return false;
                }
            } else if(s.charAt(i)==']') {
                if(s.charAt(i-1)!='[') {
                    return false;
                }
            } else if (s.charAt(i)==')') {
                if(s.charAt(i-1)!='(') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
