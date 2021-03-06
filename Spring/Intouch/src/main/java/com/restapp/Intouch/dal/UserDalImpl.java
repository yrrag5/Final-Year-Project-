package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDalImpl implements UserDal {
   // private UserDal repo;

    private final MongoTemplate mongoTemplate;
    @Autowired
    public UserDalImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;

    }

    @Override
    public User saveUser(User user) {
        mongoTemplate.save(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }
}
