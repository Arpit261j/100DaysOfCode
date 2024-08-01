package Streams.practice;

import java.util.Arrays;
import java.util.List;

public class findAverage {

    public static double avg(List<Integer> list) {
        return list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        System.out.println(avg(Arrays.asList(5,5,5,5,5)));
    }
}
