package com.yilu.demo2_1;

public class test {
    public static void main(String[] args) {
        Creep creep1 = new Creep();
        Creep creep2 = new Creep();
        creep1.setName("Creep-A");
        creep2.setName("Creep-B");
        creep1.start();
        creep2.start();
    }
}
