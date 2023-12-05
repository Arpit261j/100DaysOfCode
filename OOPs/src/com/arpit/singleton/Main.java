package com.arpit.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();//will every time return only a single instance
        Singleton obj2 = Singleton.getInstance();//will every time return only a single instance
        Singleton obj3 = Singleton.getInstance();//will every time return only a single instance

        //all 3 reference variable are ointing to only just 1 object;
    }
}
