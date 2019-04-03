package com.restapp.Intouch.dal;

import com.restapp.Intouch.models.User;
import java.util.List;

/*@RepositoryRestResource
//Must be changed when on heroku
@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})*/
public interface UserDal {
    User saveUser(User user);
    List<User> getAllUsers();

    // User updateUser(User userId);
    //void deleteUser(Club clubId);
}
