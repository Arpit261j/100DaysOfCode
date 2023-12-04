package com.arpit.one;

public class Main {
    public static void main(String[] args) {

        Student arpit = new Student();
        Student rahul=new Student(3,"Rahul",54.05f);
        Student anais=new Student(arpit);
        System.out.println(anais.rno);
        System.out.println(anais.name);
        System.out.println(anais.marks);
        arpit.greeting();
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student () {
        rno=5;
        name="Arpit";
        marks=92.09f;
    }

    Student (int rno,String name, float marks) {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    Student (Student other) {
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    public void greeting(){
        System.out.println("Hi! Greetigs by "+this.name);
    }

}