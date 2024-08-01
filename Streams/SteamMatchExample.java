package Streams;

public class SteamMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>3.4);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>3.9);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>3.9);
    }

    public static void main(String[] args) {
        System.out.println("All Match : "+ allMatch());
        System.out.println("Any Match : "+ anyMatch());
        System.out.println("None Match : "+ noneMatch());
    }

}
