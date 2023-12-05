package com.arpit.staticexample;

//outside classes cannot be static
public class InnerClasses {

    static class Test {
        String name;

        Test(String name) {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Arpit");
        Test b = new Test("Aman");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}
