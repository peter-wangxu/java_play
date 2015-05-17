package com.peter.test;

public class TestEclim {
    public static void main(String [] argv) {
        System.out.println("Succeed in configurating Eclim and YouCompleteMe plugin");
        for ( int i = 0; i < 10; i++) {
            TestSync s = new TestSync();
            s.start();
        }
    }
}


class TestSync extends Thread{
    public static Object lock = new Object();
    public void run() {
        System.out.println("This is before the sync block");
        synchronized(lock) {
        System.out.printf("%d, Now in synchronized block\n", Thread.currentThread().getId());
        System.out.println("will sleep for 3 seconds");
        try {
        Thread.sleep(3000);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("This is end of  the sync block");
        }
    }
}
