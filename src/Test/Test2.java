package Test;

import game.A;

public class Test2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                A a1 = A.getA();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                A a1 = A.getA();
            }
        });
        t1.start();
        t2.start();
    }

}
