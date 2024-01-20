package com.arpit.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;


    //default constructor
    Box() {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    //parameterized constructor
    Box(double side) {
        this.l=side;
        this.h=side;
        this.w=side;
    }

    //3 parameters
    Box(double l, double h, double w) {
        this.l=l;
        this.h=h;
        this.w=w;
    }

    //copy constructor
    Box(Box old) {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    public void information () {
        System.out.println("Running the box");
    }
}
