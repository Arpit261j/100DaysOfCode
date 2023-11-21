public class StringPalindromeExample {
    public static void main(String[] args) {
        String s="AbccBa";
        s=s.toLowerCase();
        boolean b=true;
        int start=0,end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) {
                b=false;
            }
            start++;
            end--;
        }
        System.out.println(b);
    }
}
