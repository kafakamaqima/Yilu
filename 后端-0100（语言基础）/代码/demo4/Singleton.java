package com.yilu.demo4;

public class Singleton {
    private static volatile Singleton instance;

    // 私有构造函数防止外部实例化
    private Singleton() {
        // 防止反射攻击
        if (instance != null) {
            throw new IllegalStateException("已经初始化");
        }
    }

    public static Singleton getInstance() {
        // 第一次检查
        Singleton result = instance;
        if (result == null) {
            // 同步块
            synchronized (Singleton.class) {
                result = instance;
                // 第二次检查
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }
}
