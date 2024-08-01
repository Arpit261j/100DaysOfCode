package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limitExample(List<Integer> list) {
        return list.stream()
                .limit(2)
                .reduce((a,b)->a+b);
    }

    public static Optional<Integer> skipExample(List<Integer> list) {
        return list.stream()
                .skip(2)
                .reduce((a,b)->a+b);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,75,4);
        Optional<Integer> limitResult = limitExample(list);
        if(limitResult.isPresent()) {
            System.out.println("Limit result : "+ limitResult);
        } else {
            System.out.println("Nothing Passed");
        }

        Optional<Integer> skipResult = skipExample(list);
        if(skipResult.isPresent()) {
            System.out.println("Skip result : "+ skipResult);
        } else {
            System.out.println("Nothing Passed");
        }
    }
}
