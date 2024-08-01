//flatmap, sorted, distinct, count

package Streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printActivities() {

        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        return activities;
    }

    public static long printActivitiesCount() {

        long activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return activities;
    }

    public static void main(String[] args) {

        System.out.println(printActivities());
        System.out.println(printActivitiesCount());
    }

}
