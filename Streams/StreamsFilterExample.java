package Streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("female")))
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Female students are : ");
        filterStudents().forEach(System.out::println);
//        for(Student s : filterStudents()) {
//            System.out.println(s);
//        }
    }

}
