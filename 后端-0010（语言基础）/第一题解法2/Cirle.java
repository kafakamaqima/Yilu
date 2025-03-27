package com.yilu.demo1_1;

public class Cirle implements Perarea {
    private double radius;

    public Cirle() {
    }

    public Cirle(double radius) {
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
        return "Cirle{radius = " + radius + "}";
    }


    @Override
    public double get_area(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("该圆形的面积为" + area);
        return area;
    }

    @Override
    public double get_perimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("该圆形的周长为" + perimeter);
        return perimeter;
    }
}
