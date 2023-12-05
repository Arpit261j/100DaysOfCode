package com.arpit.staticexample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; //common to all

    static void message(){
        System.out.println("Hey there!");

//        System.out.println(this.age);   //can't use this because inside static can't use objects and this represents objects.
    }
    public Human (int age, String name, int salary,boolean married) {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;

        Human.population+=1;    //this-operator will also work here but convention is class name
        Human.message();
    }
}
