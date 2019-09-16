package com.bean.code;

public class shotPicture {
    private static shotPicture ourInstance = new shotPicture();

    public static shotPicture getInstance() {
        return ourInstance;
    }

    private shotPicture() {
    }

    public StateContext SC;

    public static shotPicture getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(shotPicture ourInstance) {
        shotPicture.ourInstance = ourInstance;
    }

    public StateContext getSC() {
        return SC;
    }

    public void setSC(StateContext SC) {
        this.SC = SC;
    }
}
