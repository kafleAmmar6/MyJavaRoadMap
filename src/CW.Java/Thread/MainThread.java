package CW.Java.Thread;

import CW.Java.Thread.MultiThread.Multithread;

public class MainThread {
    public static void main(String[] args) {

        System.out.println("Program Starting......\n\n");

        // Creating Object of Multithread
        Multithread thread1 = new Multithread();
        thread1.start();
    }
}
