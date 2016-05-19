package com.online.hib;

import java.io.Serializable;

public class Account implements Serializable{
	private static final long serialVersionUID = 1L;

	String accName;
    int accId;
    int userId;

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}

