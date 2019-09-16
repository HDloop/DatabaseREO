package com.bean.code;

public class User {


    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public double getBalance(){
//        System.out.println("用户余额为：" + Bank.getInstance().getBalance(this));
        return Bank.getInstance().getBalance(this);
    }

    public void getMoney(double money) {
//        System.out.println("用户取款：" + money);
        Bank.getInstance().getMoney(money,this);

    }

    public void setMoney(double money) {
//        System.out.println("用户存款金额：" + money);
        Bank.getInstance().setMoney(money,this);

    }
}
