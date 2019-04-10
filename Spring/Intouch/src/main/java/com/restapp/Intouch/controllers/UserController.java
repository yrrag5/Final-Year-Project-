package com.restapp.Intouch.controllers;

import javax.validation.Valid;
import com.restapp.Intouch.models.User;
import com.restapp.Intouch.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
//@RequestMapping("/api")
//@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepo userRepo;

    // Get users api
    @GetMapping("/get")
    @CrossOrigin(origins = "http://localhost:8090")
    public Collection<User> getAllUsers(){
        return userRepo.findAll();
        //Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
       // return userRepo.findAll(sortByCreatedAtDesc);
    }

    // Create user
    @PostMapping("/post")
    public User createUser(@Valid @RequestBody User user) {
        return userRepo.save(user);
    }

    // Get user by id
    @GetMapping(value="/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
        return userRepo.findById(id)
                .map(todo -> ResponseEntity.ok().body(todo))
                .orElse(ResponseEntity.notFound().build());
    }

    // Update user
    @PutMapping(value="/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id,
                                           @Valid @RequestBody User user) {
         return userRepo.findById(id)
                .map(userData -> {
                    userData.setUserId(user.getUserId());
                    userData.setUserName(user.getUserName());
                    userData.setUserDOB(user.getUserDOB());
                    userData.setUserEmail(user.getUserEmail());
                    userData.setUserNumber(user.getUserNumber());

                    User updatedTodo = userRepo.save(userData);
                    return ResponseEntity.ok().body(updatedTodo);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Delete user
    @DeleteMapping(value="/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id) {
        return userRepo.findById(id)
                .map(todo -> {
                    userRepo.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
