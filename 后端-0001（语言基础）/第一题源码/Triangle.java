package com.yilu.demo1;

public class Triangle {
    private double len1;
    private double len2;
    private double len3;


    public Triangle() {
    }

    public Triangle(double len1, double len2, double len3) {
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }

    /**
     * 获取
     *
     * @return len1
     */
    public double getLen1() {
        return len1;
    }

    /**
     * 设置
     *
     * @param len1
     */
    public void setLen1(double len1) {
        this.len1 = len1;
    }

    /**
     * 获取
     *
     * @return len2
     */
    public double getLen2() {
        return len2;
    }

    /**
     * 设置
     *
     * @param len2
     */
    public void setLen2(double len2) {
        this.len2 = len2;
    }

    /**
     * 获取
     *
     * @return len3
     */
    public double getLen3() {
        return len3;
    }

    /**
     * 设置
     *
     * @param len3
     */
    public void setLen3(double len3) {
        this.len3 = len3;
    }

    public String toString() {
        return "Triangle{len1 = " + len1 + ", len2 = " + len2 + ", len3 = " + len3 + "}";
    }
}
