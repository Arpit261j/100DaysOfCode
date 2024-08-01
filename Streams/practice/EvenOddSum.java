package Streams.practice;

import java.util.Arrays;
import java.util.List;

public class EvenOddSum {

    public static long sumOdd(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->b%2==0?a+b:a);
    }

    public static long sumEven(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->b%2!=0?a+b:a);
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(Arrays.asList(1,5,6,8,5,8)));
        System.out.println(sumEven(Arrays.asList(1,5,6,8,5,8)));
    }
}
