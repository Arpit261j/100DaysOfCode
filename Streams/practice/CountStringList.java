package Streams.practice;

import java.util.Arrays;
import java.util.List;

public class CountStringList {

    public static long countString(List<String> list){
        return list.stream()
                .filter(s->s.startsWith("Ar"))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(countString(Arrays.asList("Arpit","Arshit","Gupta","Gujral","Gundappa")));
    }
}
