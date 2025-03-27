package com.yilu.demo1_1;

public class NotTriangle extends RuntimeException {
    public NotTriangle() {
    }

    public NotTriangle(String message) {
        super(message);
    }
}
