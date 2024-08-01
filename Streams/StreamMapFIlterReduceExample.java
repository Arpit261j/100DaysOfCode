package Streams;

public class StreamMapFIlterReduceExample {

    public static int noOfNotebooks() {

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>3)
                .peek((students)-> {
                    System.out.println(students);
                })
                .map(Student::getNoteBooks)
                .reduce(0,(a,b)->a+b);

    }

    public static void main(String[] args) {

        System.out.println(noOfNotebooks());

    }

}
