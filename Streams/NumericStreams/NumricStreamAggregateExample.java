package Streams.NumericStreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumricStreamAggregateExample {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,10).sum();
        long count = IntStream.rangeClosed(1,10).count();
        System.out.println("sum : "+sum);
        System.out.println("count : "+count);

        OptionalInt optionalInt = IntStream.rangeClosed(1,10).max();

        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : 0);

        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();

        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,100).average();

        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }
}
