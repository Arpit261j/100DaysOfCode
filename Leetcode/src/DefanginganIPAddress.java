public class DefanginganIPAddress {
    public static void main(String[] args) {
        String str="1.1.1.1";
        System.out.println(defangIPaddr(str));
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++) {
            if(address.charAt(i)=='.') {
                sb.append("[.]");
                continue;
            }
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}
