package com.yilu.demo1_1;

public interface Perarea {

    default double get_area(double a) {
        return 0;
    }

    default double get_perimeter(double a) {
        return 0;
    }

    default double get_area(double a, double b) {
        return 0;
    }

    default double get_perimeter(double a, double b) {
        return 0;
    }
}
