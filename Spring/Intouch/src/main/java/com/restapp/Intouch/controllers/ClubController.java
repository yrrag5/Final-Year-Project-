package com.restapp.Intouch.controllers;

import javax.validation.Valid;

import com.restapp.Intouch.models.Club;
//import com.restapp.Intouch.models.User;
import com.restapp.Intouch.repositories.ClubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
//@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:8100", "file://"})
public class ClubController {

    @Autowired
    ClubRepo clubRepo;

    // Get users api
    @GetMapping("/clubs")
    @ResponseBody
    public Collection<Club> getAllClubs(){
        return clubRepo.findAll();
        //Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        // return userRepo.findAll(sortByCreatedAtDesc);
    }

    // Create club
    @PostMapping("/club")
    public Club createClub(@Valid @RequestBody Club club) {
        return clubRepo.save(club);
    }

   /* // Get club by id
    @GetMapping(value="/user/{clubId}")
    public ResponseEntity<User> getUserById(@PathVariable("clubId") String clubId) {
        return clubRepo.findById(clubId)
                .map(club -> ResponseEntity.ok().body(club))
                .orElse(ResponseEntity.notFound().build());
    }*/

    // Update club
    @PutMapping(value="/club/{clubId}")
    public ResponseEntity<Club> updateClub(@PathVariable("clubId") String clubId,
                                           @Valid @RequestBody Club club) {
        return clubRepo.findById(clubId)
                .map(clubData -> {

                    clubData.setClubId(club.getClubId());
                    clubData.setClubName(club.getClubName());
                    clubData.setClubAddress(club.getClubAddress());
                    clubData.setClubEmail(club.getClubEmail());
                    clubData.setClubMobile(club.getClubMobile());

                    Club updatedClub = clubRepo.save(clubData);
                    return ResponseEntity.ok().body(updatedClub);
                }).orElse(ResponseEntity.notFound().build());
    }

    // Delete club
    @DeleteMapping(value="/club/{clubId}")
    public ResponseEntity<?> deleteClub(@PathVariable("clubId") String clubId) {
        return clubRepo.findById(clubId)
                .map(todo -> {
                    clubRepo.deleteById(clubId);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
