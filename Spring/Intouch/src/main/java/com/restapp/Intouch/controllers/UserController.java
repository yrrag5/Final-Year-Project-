package com.restapp.Intouch.controllers;

import javax.validation.Valid;
import com.restapp.Intouch.models.User;
import com.restapp.Intouch.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/Users")
    public List<User> getAllUsers(){
        //return userRepo.findAll();
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return userRepo.findAll(sortByCreatedAtDesc);
    }

    /*@PostMapping("/Users")
    public User createUser(@Valid @RequestBody User user) {
        //user.setCompleted(false);
        return userRepo.save(user);
    }*/

   /* @GetMapping(value="/Users/{id}")
    public ResponseEntity<User> getTodoById(@PathVariable("id") String id) {
        return UserRepo.findById(id)
                .map(todo -> ResponseEntity.ok().body(todo))
                .orElse(ResponseEntity.notFound().build());
    }*/

   /* @PutMapping(value="/Users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id,
                                           @Valid @RequestBody User user) {
         return UserRepo.findById(id)
                .map(todoData -> {
                    todoData.setName(todo.getName());
                    todoData.setCompleted(todo.getCompleted());
                    Todo updatedTodo = todoRepository.save(todoData);
                    return ResponseEntity.ok().body(updatedTodo);
                }).orElse(ResponseEntity.notFound().build());
    }*/

    /*@DeleteMapping(value="/Users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") String id) {
        return userRepo.findById(id)
                .map(todo -> {
                    userRepo.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }*/
}
