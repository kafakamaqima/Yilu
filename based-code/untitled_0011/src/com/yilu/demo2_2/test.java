package com.yilu.demo2_2;

public class test {
    public static void main(String[] args) {
        Creep creep = new Creep();
        Thread t1 = new Thread(creep);
        Thread t2 = new Thread(creep);
        t1.setName("Creep-A");
        t2.setName("Creep-B");
        t1.start();
        t2.start();
    }
}
