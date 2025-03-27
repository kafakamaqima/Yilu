package com.yilu.demo1;

public interface Perarea {
    public static double get_area(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("该圆形的面积为" + area);
        return area;
    }

    static double get_perimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("该圆形的周长为" + perimeter);
        return perimeter;
    }

    static double get_area(double len, double wid) {
        double area = len * wid;
        System.out.println("该长方形的面积为" + area);
        return area;
    }

    static double get_perimeter(double len, double wid) {
        double perimiter = (len + wid) * 2;
        System.out.println("该长方形的周长为" + perimiter);
        return perimiter;
    }
}
