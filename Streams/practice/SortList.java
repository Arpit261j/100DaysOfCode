package Streams.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortList {

    public static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted()
                .collect(toList());
    }
    public static List<String> sortListDesc(List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(sortList(Arrays.asList("Arpit","Gupta","Chaurasiya")));
        System.out.println(sortListDesc(Arrays.asList("Arpit","Gupta","Chaurasiya")));
    }
}
