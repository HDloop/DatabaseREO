package com.bean.code;

import com.Abstract.code.Admin;

public class concreteAdmin implements Admin {
    @Override
    public void rollBack(StateContext stateContext) {
        System.out.println("开始回滚。。。。");
        stateContext.handle();
    }
}
