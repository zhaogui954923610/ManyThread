package com.hsap.myapplication.provider;

/**
 * Created by zhao on 2018/1/18.
 */

public class User {
    public int userId;
    public String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userId+"----"+userName;
    }
}
