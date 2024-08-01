package Streams.Streams_Terminal;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count(List<Integer> list) {
        return list.stream()
                .filter(n->n>5)
                .collect(counting());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,6,10);
        System.out.println(count(list));
    }
}
