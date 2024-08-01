package Streams;

import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {

        Stream<String> value = Stream.of("Adam", "Eve", "Jack");
        value.forEach(System.out::println);

        Stream.iterate(1,x->x*2)        //return infinite values of 2 multiple
                .limit(10)          //limits upto 10
                .forEach(System.out::println);
    }

}
