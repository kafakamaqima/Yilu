package com.yilu.demo1;

public class Circle implements Perarea {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 获取
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius = " + radius + "}";
    }
}
