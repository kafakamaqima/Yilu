package com.yilu.demo1_1;

public class Rectangle implements Perarea {
    private double lengthen;
    private double width;

    @Override
    public double get_area(double len, double wid) {
        double area = len * wid;
        System.out.println("该长方形的面积为" + area);
        return area;
    }

    @Override
    public double get_perimeter(double len, double wid) {
        double perimiter = (len + wid) * 2;
        System.out.println("该长方形的周长为" + perimiter);
        return perimiter;

    }

    public Rectangle() {
    }

    public Rectangle(double lengthen, double width) {
        this.lengthen = lengthen;
        this.width = width;
    }

    /**
     * 获取
     *
     * @return lengthen
     */
    public double getLengthen() {
        return lengthen;
    }

    /**
     * 设置
     *
     * @param lengthen
     */
    public void setLengthen(double lengthen) {
        this.lengthen = lengthen;
    }

    /**
     * 获取
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle{lengthen = " + lengthen + ", width = " + width + "}";
    }
}
