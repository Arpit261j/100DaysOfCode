package com.arpit.properties.inheritance;

public class BoxWeight extends Box{

    double weight;

    BoxWeight() {
        this.weight=-1;
    }
    BoxWeight(BoxWeight other) {
        super(other);
        this.weight=other.weight;
    }

    BoxWeight(double weight) {
        this.weight=weight;
    }

    BoxWeight(double h, double l, double w, double weight) {
        super(l,w,h);//super-calling parent class constructor;
        //super class initialization will always come before child class properties;
        this.weight=weight;
    }
}
