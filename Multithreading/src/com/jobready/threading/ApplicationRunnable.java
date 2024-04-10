package com.jobready.threading;

public class ApplicationRunnable {
    public static void main(String[] args) {

//        System.out.println("Started Thread A");
//        Thread t1 = new Thread(new Task1("Thread-A"));
//        t1.start();
//
//        System.out.println("Started Thread B");
//        Thread t2= new Thread(new Task1("Thread-B"));
//        t2.start();

        //Another method of creating thread without another class

        System.out.println("Started Thread 1");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++) {
                    System.out.println("Nums :" + i + " - "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t1.start();

        System.out.println("Started Thread 2");
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++) {
                    System.out.println("Nums :" + i + " - "+ Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t2.start();

    }
}


//class Task1 implements Runnable {
//    String name;
//
//    Task1(String name){
//        this.name=name;
//    }
//
//    public void run() {
//        Thread.currentThread().setName(name);
//        for(int i=0;i<1000;i++) {
//            System.out.println("Nums :" + i + " - "+ Thread.currentThread().getName());
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}