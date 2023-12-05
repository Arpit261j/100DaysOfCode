package com.arpit.singleton;

//Singleton class only creates one object
public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        //check whether only one instance is created or not.
        if(instance==null) {
            instance=new Singleton();
        }

        return instance;
    }
}
