package com.restapp.Intouch.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "club")
public class Club {
    @Id
    private String clubId;
    private String clubName;
    private String address;

    public Club(){

    }

    public Club(String clubName, String address) {
        this.clubName = clubName;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Club{clubId='%s', clubName='%s', address=%s}\n",
                clubId,clubName, address);
    }
}


