package com.yilu.demo2_1;

import java.util.Scanner;

public class test {
    private static double remains = 10000.0;

    public static void main(String[] args) throws InsufficientBalanceException {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的账户号码：");
        bank.setId(sc.nextLine());
        System.out.println("请输入您要提取的金额：");
        bank.setMoney(Double.parseDouble(sc.nextLine()));
        try {
            if (bank.getMoney() > remains) {
                throw new InsufficientBalanceException("账户余额不足,账户\"" + bank.getId() + "\"尝试提取的金额\"" + bank.getMoney() + "元\"失败");
            } else {
                remains -= bank.getMoney();
                System.out.println("账户“" + bank.getId() + "”提取余额“" + bank.getMoney() + "元”成功，当前余额为" + remains + "元");
            }
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
