package com.yilu.demo2_1;

public class PlainRect extends Rect {
    private double startX;
    private double startY;

    public PlainRect() {
    }

    public PlainRect(double startX, double startY, double width, double height) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public boolean isInside(double x, double y) {
        double right = this.getWidth() + startX;
        double down = startY - this.getHeight();
        if (!(x > startX && x < right) && (y < startY && y > down)) {
            return false;
        }
        return true;
    }
}
