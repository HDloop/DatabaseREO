package com.Abstract.code;

import com.bean.code.User;

public abstract class State {
    public void setUser(User user) {
        this.user = user;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User user;
    public double balance;

    public abstract void handle();
}
