package Streams.practice;

import java.util.*;

public class MaxMinValue {

    public static int maxValue(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->a<b?b:a);
    }
    public static Integer maxValueFunction(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .orElse(0);
    }
    public static Integer minValueFunction(List<Integer> list) {
        return list.stream()
                .min(Integer::compare)
                .orElse(0);
    }
    public static Integer minValue(List<Integer> list) {
        return list.stream()
                .reduce((a,b)->a>b?b:a)
                .orElse(0);
    }

    public static Integer secondSmallest(List<Integer> list) {
        return list.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
    }
    public static Integer secondlargest(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static void main(String[] args) {
//        System.out.println(maxValue(Arrays.asList(5,9,19,352)));
//        System.out.println(minValue(Arrays.asList(5,9,19,352)));
//        System.out.println("Function max : " + maxValueFunction(Arrays.asList(5,9,19,352)));
//        System.out.println("Function min : " + minValueFunction(Arrays.asList(5,9,19,352)));
//        System.out.println("Second Smallest : " + secondSmallest(Arrays.asList(5,9,19,352)));
//        System.out.println("Second Smallest : " + secondlargest(Arrays.asList(5,9,19,352)));

        //Iterator

//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,43,657,34,45,23));
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            Integer i= (Integer) iterator.next();
//            if(i%2==0)
//                System.out.println(i);
//            else
//                iterator.remove();
//        }
//        System.out.println(list);

        //listIterator

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Arpit", "Gupta", "Ranvijay"));

        ListIterator li = str.listIterator(str.size());
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }
     }
}
