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
    @GetMapping("/users")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:8200")
    public Collection<User> getAllUsers(){
        return userRepo.findAll();
        //Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
       // return userRepo.findAll(sortByCreatedAtDesc);
    }

    // Create user
    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return userRepo.save(user);
    }

    // Get user by id
    @GetMapping(value="/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return userRepo.findById(userId)
                .map(user -> ResponseEntity.ok().body(user))
                .orElse(ResponseEntity.notFound().build());
    }

   /*// Get user by id
    @GetMapping(value="/search/{userId}")
    public String getUserById (@PathVariable("userId") String userId) {
        return userRepo.findById(userId).toString();
    }*/

    // Update user
    @PutMapping(value="/user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable("userId") String userId,
                                           @Valid @RequestBody User user) {
         return userRepo.findById(userId)
                .map(userData -> {

                    userData.setUserId(user.getUserId());
                    userData.setUserName(user.getUserName());
                    userData.setUserDOB(user.getUserDOB());
                    userData.setUserEmail(user.getUserEmail());
                    userData.setUserNumber(user.getUserNumber());

                    User updatedUser = userRepo.save(userData);
                    return ResponseEntity.ok().body(updatedUser);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Delete user
    @DeleteMapping(value="/user/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") String userId) {
        return userRepo.findById(userId)
                .map(todo -> {
                    userRepo.deleteById(userId);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
