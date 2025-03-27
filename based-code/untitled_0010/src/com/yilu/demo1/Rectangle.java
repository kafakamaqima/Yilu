package com.yilu.demo1;

public class Rectangle implements Perarea {
    private double len;
    private double wid;

    public Rectangle() {
    }

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    /**
     * 获取
     *
     * @return len
     */
    public double getLen() {
        return len;
    }

    /**
     * 设置
     *
     * @param len
     */
    public void setLen(double len) {
        this.len = len;
    }

    /**
     * 获取
     *
     * @return wid
     */
    public double getWid() {
        return wid;
    }

    /**
     * 设置
     *
     * @param wid
     */
    public void setWid(double wid) {
        this.wid = wid;
    }

    public String toString() {
        return "Rectangle{len = " + len + ", wid = " + wid + "}";
    }
}
