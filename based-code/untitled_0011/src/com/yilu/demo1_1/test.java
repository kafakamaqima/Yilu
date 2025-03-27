package com.yilu.demo1_1;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(3);
        Cook senshi = new Cook(buffer, "丰川祥子");
        Foodie laoba = new Foodie(buffer, "长崎素世");
        Foodie marusiel = new Foodie(buffer, "三角初音");
        Food f = new Food("大祥脚");

        new Thread(() -> senshi.produce(f)).start();
        new Thread(laoba::consume).start();
        new Thread(marusiel::consume).start();
    }
}
