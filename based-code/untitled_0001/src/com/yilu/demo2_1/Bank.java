package com.yilu.demo2_1;

public class Bank {
    private String id;
    private double money;

    public Bank() {
    }

    public Bank(String id, double money) {
        this.id = id;
        this.money = money;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     *
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Bank{id = " + id + ", money = " + money + "}";
    }
}
