package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClubDalImpl implements ClubDal {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public ClubDalImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;

    }

    @Override
    public Club saveClub(Club club) {
        mongoTemplate.save(club);
        return club;
    }

    @Override
    public List<Club> getAllClubs() {
        return mongoTemplate.findAll(Club.class);
    }




}
