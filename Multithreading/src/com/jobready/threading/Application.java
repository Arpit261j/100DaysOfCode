package com.jobready.threading;

public class Application {
    public static void main(String[] args) {

        System.out.println("Started Thread A");
        Task taskRunner = new Task("Thread-A");
        taskRunner.start();

        System.out.println("Started Thread B");
        Task taskRunner2 = new Task("Thread-B");
        taskRunner2.start();
    }
}
class Task extends Thread {
    String name;

    Task(String name){
        this.name=name;
    }

    public void run() {
        Thread.currentThread().setName(name);
        for(int i=0;i<1000;i++) {
            System.out.println("Nums :" + i + " - "+ Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
