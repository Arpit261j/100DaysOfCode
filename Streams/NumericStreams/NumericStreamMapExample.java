package Streams.NumericStreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObject() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i)->{
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1,5)
                .mapToLong((i)->i)
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i)->i)
                .sum();
    }



    public static void main(String[] args) {
        System.out.println("Object : " + mapToObject());
        System.out.println("Long : " + mapToLong());
        System.out.println("Double : " + mapToDouble());
    }
}
