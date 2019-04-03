package com.restapp.Intouch.models;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String userId;
    private String userName;
    private String userDOB;
    private String userEmail;
    private String userNumber;

    public User(){

    }

    public User(String userId, String userName, String userDOB, String userEmail, String userNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return String.format("User{id='%s', userId='%s', userName='%s', userDOB='%s', userEmail='%s', userNumber='%s'}\n",
                id,userId, userName, userDOB, userEmail, userNumber);
    }
}
