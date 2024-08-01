package Streams.practice;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class LowerCaseUpperCaseStrings {

    public static List<String> methodLowerCase(List<String> list) {
        return list.stream()
                .map(str->str.toLowerCase())
                .collect(toList());
    }

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Arpit","Gupta");
        System.out.println(methodLowerCase(str));
    }
}
