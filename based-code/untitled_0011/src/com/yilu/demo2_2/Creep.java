package com.yilu.demo2_2;

public class Creep implements Runnable {
    int hp = 100;
    private ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 3);

    @Override
    public void run() {
        while (count.get() > 0) {

            if (method()) break;

            if (count.get() == 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " end.");
    }

    private synchronized boolean method() {
        if (hp == 0) {
            return true;
        }
        hp -= 20;
        count.set(count.get() - 1);
        System.out.println(Thread.currentThread().getName() + " attack...");
        System.out.println(Thread.currentThread().getName() + ": 当前player的hp值= " + hp);
        if (hp == 0) {
            System.out.println(Thread.currentThread().getName() + ": player is dead.");
        }
        return false;
    }
}
