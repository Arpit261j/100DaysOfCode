package com.arpit.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4,2,2.9);
//        Box box1=new Box(box);
//        System.out.println(box1.l+" "+box1.h+" "+box1.w);

//        BoxWeight box3=new BoxWeight();
//        BoxWeight box4=new BoxWeight(4);
//        System.out.println(box4.h+" "+box4.weight);

//        BoxWeight box5= new BoxWeight(4,5,6,7);
//        System.out.println(box5.l+" "+box5.w+" "+box5.h+" "+box5.weight);


//        Box box6 = new BoxWeight(4,5,6,7);
//        System.out.println(box6.l);
//        System.out.println(box6.weight);//wrong-can't access child properties

        BoxWeight box7=new BoxWeight(2,3,4,7);
        BoxWeight box8=new BoxWeight(box7);
        System.out.println(box8.l+" "+box8.w+" "+box8.h+" "+box8.weight);
    }
}
