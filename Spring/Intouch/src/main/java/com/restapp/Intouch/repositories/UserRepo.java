package com.restapp.Intouch.repositories;

import com.restapp.Intouch.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Defines crud operations
@Repository
public interface UserRepo extends MongoRepository<User, String> {
}
