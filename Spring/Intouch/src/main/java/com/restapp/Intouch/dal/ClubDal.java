// Data Access Layer for club
package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.Club;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/*@RepositoryRestResource
//Must be changed when on heroku
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})*/
public interface ClubDal {
    Club saveClub(Club club);
    List<Club> getAllClubs();

   // Club updateOneClub(Club clubId);
    //void deleteClub(Club clubId);
}