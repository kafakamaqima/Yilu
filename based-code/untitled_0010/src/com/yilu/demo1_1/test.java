package com.yilu.demo1_1;

public class test {
    public static void main(String[] args) {

        Perarea rectangle = new Rectangle();
        Perarea cirle = new Cirle();
        rectangle.get_area(10, 5);
        rectangle.get_perimeter(10, 5);
        cirle.get_area(5);
        cirle.get_perimeter(5);
    }
}
