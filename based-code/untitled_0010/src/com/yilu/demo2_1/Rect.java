package com.yilu.demo2_1;

public class Rect {
    private double width;
    private double height;

    public Rect() {
        width = 10;
        height = 10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        double area = width * height;
        System.out.println("该矩形的面积为" + area);
        return area;
    }

    public double perimeter() {
        double perimeter = (width + height) * 2;
        System.out.println("该矩形的周长为" + perimeter);
        return perimeter;
    }
}
