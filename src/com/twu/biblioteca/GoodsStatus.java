package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-3-3.
 */
public class GoodsStatus {
    String status;
    UserAccount userAccount;

    public GoodsStatus(String status, UserAccount userAccount) {
        this.status = status;
        this.userAccount = userAccount;
    }

    public GoodsStatus() {
        this.status = "keep";
        this.userAccount = null;
    }

    public String getStatus() {
        return status;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
}
