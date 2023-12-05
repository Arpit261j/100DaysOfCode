package com.arpit.staticexample;

public class Main {
    public static void main(String[] args) {
//        Human arpit=new Human(24,"Arpit",22500,false);
//        Human aman=new Human(27,"Aman",55000,true);
//
//
//        System.out.println(Human.population);//convention-Human.population
//        System.out.println(arpit.population);//convention-Human.population
//        System.out.println(aman.population);//convention-Human.population
        Human.message();
        fun();

    }
    //for static methods we don't need to create the object of the class we can directly use them.

    //fun is not dependent on the objects
    static void fun() {
        Main m=new Main();//you have to create the object for the class;
        m.greeting();//cannot access a non static method from a static method directly;
    }


    //greeting depends on the objects.
    void greeting() {
        System.out.println("Hello!");
    }


}
