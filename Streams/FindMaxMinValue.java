package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxMinValue {

    public static int findMax(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->a>b?a:b);
    }

    public static Optional<Integer> findMinValue(List<Integer> list) {
        return list.stream()
                .reduce((a,b)->a<b? a:b);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,14,63,5);
        System.out.println("Greates number : "+ findMax(list));
        Optional<Integer> minValueOptional = findMinValue(list);


        if (minValueOptional.isPresent()) {
            System.out.println("Least number : "+ minValueOptional);
        } else {
            System.out.println("No Input Passed");
        }

    }
}
