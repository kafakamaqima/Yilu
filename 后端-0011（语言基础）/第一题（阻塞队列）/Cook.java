package com.yilu.demo1_1;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook implements Producer {
    ArrayBlockingQueue<String> queue;
    private String name;

    public Cook() {
    }

    public Cook(ArrayBlockingQueue<String> queue, String name) {
        this.queue = queue;
        this.name = name;
    }


    @Override
    public void produce(Food food) {
        while (true) {
            try {
                queue.put(food.getName());
                System.out.println(getName() + "做了一份" + food.getName());
                Thread.sleep(1000);
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
        return "Cook{queue = " + queue + ", name = " + name + "}";
    }
}
