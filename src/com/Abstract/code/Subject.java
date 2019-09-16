package com.Abstract.code;

import java.util.Vector;
import com.bean.code.shotPicture;
public abstract class Subject {
    private Vector<Admin> obsVector = new Vector<Admin>();

    public void addObserver(Admin o) {
        this.obsVector.add(o);
    }

    public void delObserver(Admin o) {
        this.obsVector.remove(o);
    }

    public void notifyObservers() {
        for (Admin o:obsVector) {
            o.rollBack(shotPicture.getInstance().getSC());
        }
    }
}
