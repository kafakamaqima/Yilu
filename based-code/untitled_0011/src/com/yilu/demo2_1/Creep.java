package com.yilu.demo2_1;

public class Creep extends Thread {
    static int hp = 100;
    int count = 3;

    @Override
    public void run() {
        while (true) {
            synchronized (Creep.class) {
                if (hp == 0 || count == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    hp -= 20;
                    count--;
                    System.out.println(Thread.currentThread().getName() + " attack...");
                    System.out.println(Thread.currentThread().getName() + ":当前player的hp值= " + hp);
                    if (hp == 0) System.out.println(Thread.currentThread().getName() + ": player is dead.");
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " end.");
    }
}