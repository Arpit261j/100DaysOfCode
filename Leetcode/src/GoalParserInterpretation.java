public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str="G()(al)";
        System.out.println(interpret(str));
    }
    public static String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++) {
            if(command.charAt(i)==')') {
                if(command.charAt(i-1)=='(') {
                    sb.append('o');
                    continue;
                } else {
                    continue;
                }
            }
            if(command.charAt(i)=='(') {
                continue;
            }
            sb.append(command.charAt(i));
        }
        return sb.toString();
    }
}
