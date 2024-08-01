package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> getStudentBySortedName() {

        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {

        System.out.println("Student list according to sorted names : ");
        getStudentBySortedName().forEach(System.out::println);

    }

}
