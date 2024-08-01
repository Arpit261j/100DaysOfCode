package Streams.Streams_Terminal;

import Streams.Student;
import Streams.StudentDataBase;

import java.sql.SQLOutput;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsJoiningExample {

    public static String Joining1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String Joining2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String Joining3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining1 : " + Joining1());
        System.out.println("Joining2 : " + Joining2());
        System.out.println("Joining3 : " + Joining3());
    }

}
