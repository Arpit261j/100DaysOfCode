package Streams.NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> box() {                 //primitive to wrapper
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //integer
                .collect(toList());
    }

    public static int unbox(List<Integer> list) {       //wrapper to primitive
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }


    public static void main(String[] args) {
        System.out.println(box());

        System.out.println(unbox(Arrays.asList(5,16,3,6)));
    }
}
