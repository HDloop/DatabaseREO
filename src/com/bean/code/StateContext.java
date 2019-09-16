package com.bean.code;

import com.Abstract.code.State;

public class StateContext extends State {
    @Override
    public void handle() {
        Bank.getInstance().addUser(this.user, this.balance);
    }
    public StateContext(User user,double balance) {
        super.setUser(user);
        super.setBalance(balance);
    }
}
