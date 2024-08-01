package Streams.practice;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class RemoveDuplicate {

    public static List<Integer> removeDuplicate(List<Integer> list){
        return list.stream()
                .distinct()
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate(Arrays.asList(1,5,6,7,7,8,9,9,9,9,9)));
    }
}
