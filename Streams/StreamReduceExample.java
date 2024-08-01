package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static int multiplication(List<Integer> list) {

        return list.stream()
                .reduce(1,(a,b)-> a*b);

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,2,5,7);

        System.out.println(multiplication(list));
    }

}
