package com.restapp.Intouch.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapp.Intouch.models.Club;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
//Must be changed when on heroku
//@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
public interface ClubRepository //extends JpaRepository<Club, Long>
{

}
