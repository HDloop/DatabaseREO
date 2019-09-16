package com.bean.code;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nikk","001");
        User user2 = new User("Sixx","002");

        Bank.getInstance().addUser(user1,100.0);    //开户
        Bank.getInstance().getBalance(user1);               //取得余额
        Bank.getInstance().setMoney(300.0,user1);   //存款300.0
        user1.getBalance();                                 //显示余额
        Bank.getInstance().getMoney(200.0,user1);   //取款200.0
        //开始回滚...
        System.out.println("银行回滚后查看余额："+Bank.getInstance().getBalance(user1));
//        user1.getBalance();
    }
}
