package Streams;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {

    public static List<String> studentNamesList() {

        List<String> studentList = StudentDataBase.getAllStudents().stream()   // get all students streams
                .map(Student::getName)              // get name map
                .map(String::toUpperCase)
                .collect(toList());                 // terminal operation

        return studentList;
    }

    public static Set<String> studentNamesSet() {

        Set<String> studentList = StudentDataBase.getAllStudents().stream()   // get all students streams
                .map(Student::getName)              // get name map
                .map(String::toUpperCase)
                .collect(toSet());                 // terminal operation

        return studentList;
    }

    public static void main(String[] args) {

        System.out.println(studentNamesList());
        System.out.println(studentNamesSet());

    }

}
