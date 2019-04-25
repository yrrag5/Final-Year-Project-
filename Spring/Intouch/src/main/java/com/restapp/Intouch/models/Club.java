package com.restapp.Intouch.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Document(collection = "club")
//@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Club {
    @Id
    private String clubId;
    private String clubName;
    private String clubAddress;
    private String clubEmail;
    private String clubMobile;

    public Club(){

    }

    public Club(String clubId, String clubName, String clubAddress, String clubEmail, String clubMobile){
        this.clubId = clubId;
        this.clubName = clubName;
        this.clubAddress = clubAddress;
        this.clubEmail = clubEmail;
        this.clubMobile = clubMobile;

    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubAddress() {
        return clubAddress;
    }

    public void setClubAddress(String clubAddress) {
        this.clubAddress = clubAddress;
    }

    public String getClubEmail() {
        return clubEmail;
    }

    public void setClubEmail(String clubEmail) {
        this.clubEmail = clubEmail;
    }

    public String getClubMobile() {
        return clubMobile;
    }

    public void setClubMobile(String clubMobile) {
        this.clubMobile = clubMobile;
    }

    @Override
    public String toString() {
        return String.format("Clubs{clubId='%s', clubName='%s', clubAddress='%s', clubEmail ='%s', clubMobile ='%s'}\n",
                clubId,clubName, clubAddress, clubEmail, clubMobile);
    }
}


