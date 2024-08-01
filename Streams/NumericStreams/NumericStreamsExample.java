package Streams.NumericStreams;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    //IntStream.range(1,50) -> returns 1 to 49
    //IntStream.rangeClosed(1,50) -> returns 1 to 50

    //LongStream.range(1,50) -> returns 1 to 49 in long

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(1,6).sum()); //1,2,3,4,5,6

        //asDoubleStream converts value to double

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));
    }
}
