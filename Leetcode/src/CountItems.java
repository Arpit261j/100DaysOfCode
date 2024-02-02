import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(
                Arrays.asList(Arrays.asList("phone","blue","pixel"),
                        Arrays.asList("computer","silver","phone"),
                        Arrays.asList("phone","gold","iphone")
                ));
        System.out.println(countMatches(items,"type","phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=-1,ans=0;
        if(ruleKey.equals("type")) {
            i=0;
        } else if(ruleKey.equals("color")) {
            i=1;
        } else {
            i=2;
        }
        for(int j=0;j<items.size();j++) {
            if(items.get(j).get(i).equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
