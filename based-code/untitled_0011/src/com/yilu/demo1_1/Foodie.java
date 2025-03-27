package com.yilu.demo1_1;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie implements Consumer {
    ArrayBlockingQueue<String> queue;
    private String name;

    public Foodie() {
    }

    public Foodie(ArrayBlockingQueue<String> queue, String name) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void consume() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println(getName() + "吃了一份" + food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Foodie{name = " + name + ", queue = " + queue + "}";
    }
}
