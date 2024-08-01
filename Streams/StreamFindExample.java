package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindExample {

    public static Optional<Integer> findAny(List<Integer> list) {
        return list.stream()
                .filter(n->n>4)
                .findAny();
    }
    public static Optional<Integer> findfirst(List<Integer> list) {
        return list.stream()
                .filter(n->n>5)
                .findFirst();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,7,9,54,7,435,32,54);

        Optional<Integer> resultFindAny = findAny(list);
        if(resultFindAny.isPresent()) {
            System.out.println("Result FindAny : " + resultFindAny);
        } else {
            System.out.println("No value Passed!!");
        }

        Optional<Integer> resultFindFirst = findfirst(list);
        if(resultFindFirst.isPresent()) {
            System.out.println("Result FindFirst : " + resultFindFirst);
        } else {
            System.out.println("No value Passed!!");
        }

    }
}
