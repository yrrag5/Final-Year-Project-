// Data Access Layer for club
package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.Club;

import java.util.List;

public interface ClubDal {
    Club saveClub(Club club);
    List<Club> getAllClubs();

   // Club updateOneClub(Club clubId);
    //void deletePerson(Club clubId);
}
