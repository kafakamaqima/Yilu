package com.yilu.demo2_1;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
