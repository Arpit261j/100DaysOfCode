public class ShuffleString {
    public static void main(String[] args) {
        String  s="codeLeet";
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(restoreString(s,arr));
    }
    public static String restoreString(String s, int[] indices) {
        char[] ch= new char[s.length()];
        for(int i=0;i<indices.length;i++) {
            ch[indices[i]]=s.charAt(i);
        }
        return String.valueOf(ch);
    }
}
