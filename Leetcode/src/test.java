public class test {
    public static void main(String[] args) {
        String[] s={"i","p","pet","fxai","ortqpwkukg","rxgh","ylfh"};
        System.out.println(prefixCount(s,"ikwjoty"));
    }
    public static int prefixCount(String[] words, String pref) {
        int count=0,count1=0;
        for(String word : words) {
            count1=0;
            for(int i=0;i<pref.length();i++) {
                if(pref.charAt(i)==word.charAt(i)) {
                    count1++;
                } else {
                    break;
                }
            }
            if(count1==pref.length()) {
                count++;
            }
        }
        return count;
    }
}
