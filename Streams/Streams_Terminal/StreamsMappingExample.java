package Streams.Streams_Terminal;

import Streams.Student;
import Streams.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {

    public static void main(String[] args) {

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));

        List<String> nameList1 = StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getName)
                        .collect(Collectors.toList());

        System.out.println(namesList);
        System.out.println(nameList1);
    }
}
