package com.restapp.Intouch.models;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection ="Users")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class User {
    @Id
    private String id;
    private String userId;
    private String userName;
    private String userDOB;
    private String userEmail;
    private String userNumber;

    public User(){
       // super();
    }

    public User(String userId, String userName, String userDOB, String userEmail, String userNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userNumber = userNumber;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public void setUserDOB(String userDOB){
        this.userDOB = userDOB;
    }

    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }

    public void setUserNumber(String userNumber){
        this.userNumber = userNumber;
    }

    public String getId(){
        return id;
    }
    public String getUserId(){
        return userId;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserDOB(){
        return userDOB;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public String getUserNumber(){
        return userNumber;
    }


    @Override
    public String toString() {
        return String.format("Users{id='%s', userId='%s', userName='%s', userDOB='%s', userEmail='%s', userNumber='%s'}\n",
                id,userId, userName, userDOB, userEmail, userNumber);
    }
}
