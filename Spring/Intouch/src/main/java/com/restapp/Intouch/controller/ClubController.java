package com.restapp.Intouch.controller;

import com.restapp.Intouch.models.Club;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.stream.Collectors;

public class ClubController {
    private ClubRepository repo;

    public ClubController(ClubRepository repository){
        this.repo = repo;
    }

    @GetMapping("/getClubs")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Club> getClubs(){
        return repo.findAll().stream()
                .collect(Collectors.toList());

    }
}
