package com.bean.code;

import com.Abstract.code.Subject;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Bank extends Subject {
    private static Bank ourInstance = new Bank();
    private static HashMap<User,Double> coll= new HashMap<>();
    public static Bank getInstance() {

        return ourInstance;
    }

    private Bank() {
    }
//    Map<User, double> Coll = new HashMap<>();


    public void getMoney(double money,User user) {
        shotPicture.getInstance().setSC(new StateContext(user,Bank.getInstance().getBalance(user)));//存取快照。
        System.out.println("银行取款业务：" + money);
//        Scanner input = new Scanner();
            if (true){
                super.notifyObservers();
                return;
            }
        coll.put(user,coll.get(user)-money);
        shotPicture.getInstance().setSC(new StateContext(user,Bank.getInstance().getBalance(user)));
    }

    public void setMoney(double money,User user) {
        shotPicture.getInstance().setSC(new StateContext(user,Bank.getInstance().getBalance(user)));
        System.out.println("银行存款业务：" + money);
        coll.put(user,coll.get(user)+money);
        shotPicture.getInstance().setSC(new StateContext(user,Bank.getInstance().getBalance(user)));
    }

    public double getBalance(User user){
        System.out.println("银行查看余额：" + coll.get(user));
        return coll.get(user);
    }

    public void delete(User user) {
        coll.remove(user);
    }

    public void addUser(User user,double balance) {
        coll.put(user,balance);
        System.out.println("银行添加账户：" + user.getName()+"卡号：" + user.id +"预存余额："+user.getBalance());

    }

}
