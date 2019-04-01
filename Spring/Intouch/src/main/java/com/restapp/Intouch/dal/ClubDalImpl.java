package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClubDalImpl implements ClubDal {

    private ClubDal repo;

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


    /*@GetMapping("/getClubs")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Club> getClubs() {
        return repo.findAll().stream()
                .collect(Collectors.toList());
    }*/




}
