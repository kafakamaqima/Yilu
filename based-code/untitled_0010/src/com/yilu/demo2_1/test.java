package com.yilu.demo2_1;

public class test {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(10, 10, 20, 10);
        double area = plainRect.area();
        double perimter = plainRect.perimeter();
        boolean flag = plainRect.isInside(25.5, 13);
        if (flag) {
            System.out.println("该点在矩形内");
        } else {
            System.out.println("该点不在矩形内");
        }
    }
}
