package com.yilu.demo1_2;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final Queue<Food> queue = new LinkedList<>();
    private final int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public void put(Food food) throws InterruptedException {
        while (true) {
            synchronized (Buffer.class) {
                if (queue.size() == capacity) {
                    wait();
                } else {
                    queue.offer(food);
                    notifyAll();
                }
            }
        }
    }

    public void take() throws InterruptedException {
        while (true) {
            synchronized (Buffer.class) {
                if (queue.isEmpty()) {
                    wait();
                } else {
                    queue.poll();
                    notifyAll();
                }
            }
        }
    }
}
