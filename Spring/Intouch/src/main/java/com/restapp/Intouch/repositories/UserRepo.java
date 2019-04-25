package com.restapp.Intouch.repositories;

import com.restapp.Intouch.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

// Defines crud operations
@CrossOrigin(origins = "http://localhost:8200")
@Repository
public interface UserRepo extends MongoRepository<User, String> {
}
