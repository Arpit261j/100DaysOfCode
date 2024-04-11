package com.jobready.threading;

public class Sequence {    
    private int value=0;
    public int getNext(){  //or to synchronize without synchronized block we can use "public synchronized int getNext()"

        synchronized (this) {       //this will confirm that whole code will run together written in this block
            value=value+1;
            return value;
        }

    }
}
