package Streams.Streams_Terminal;

import Streams.Student;
import Streams.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxByExample {

    public static Optional<Student> methodMinBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> methodMaxBy() {
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static int sum(List<Integer> list) {
        return list.stream()
                .reduce(0,(a,b)->a+b);
    }


    public static void main(String[] args) {
        System.out.println(methodMinBy());
        System.out.println(methodMaxBy());
        System.out.println(sum(Arrays.asList(5,9)));
    }
}
