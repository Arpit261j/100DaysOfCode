public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","floght"};
        System.out.println(longestCommonPrefix(str));
    }
    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        int pref_len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (pref_len > s.length() || !prefix.equals(s.substring(0, pref_len))) {
                pref_len--;
                if (pref_len == 0) {
                    return "";
                }
                prefix = prefix.substring(0, pref_len);
            }
        }
        return prefix;
    }
}
