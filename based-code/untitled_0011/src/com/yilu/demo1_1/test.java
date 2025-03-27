package com.yilu.demo1_1;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(3);
        Cook senshi = new Cook(buffer, "丰川祥子");
        Cook laoba = new Cook(buffer, "长崎素世");
        Foodie marusiel = new Foodie(buffer, "三角初音");
        Food f1 = new Food("大祥脚");
        Food f2 = new Food("哈基米");
        new Thread(() -> senshi.produce(f1)).start();
        new Thread(() -> laoba.produce(f2)).start();
        new Thread(marusiel::consume).start();
    }
}
