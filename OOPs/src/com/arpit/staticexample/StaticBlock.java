package com.arpit.staticexample;

//this is a demo to show initialization of static variables.
public class StaticBlock {
    static int a=4;
    static int b;

    //will only run once when the first object is created, i.e. when the class is loaded for the first time
    static {
        System.out.println("Initializing static variables in static block!");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock sb=new StaticBlock();
        System.out.println(sb.a+" "+sb.b);

        sb.b+=3;
        System.out.println(sb.a+" "+sb.b);

        StaticBlock sb2=new StaticBlock();
        System.out.println(sb.a+" "+sb.b);
    }

}
