package com.restapp.Intouch;

import com.restapp.Intouch.controller.ClubRepository;
import com.restapp.Intouch.dal.ClubDal;
import com.restapp.Intouch.dal.UserDal;
import com.restapp.Intouch.models.Club;
//import com.restapp.Intouch.controller.ClubController;

import com.restapp.Intouch.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IntouchApplication implements CommandLineRunner{

	//private final ClubRepository repo;

	/*public IntouchApplication(ClubRepository repo){
		this.repo = repo;
	}*/

	private static final Logger LOG = LoggerFactory.getLogger("IntouchApplication");

	//private final ClubDal clubDAL;
	private final UserDal userDAL;


	/* Autowire data access layer
	@Autowired
	public IntouchApplication(ClubDal clubDAL) {
		this.clubDAL = clubDAL;
	}*/

	@Autowired
	public IntouchApplication(UserDal userDal) {
		this.userDAL = userDal;
	}


	public static void main(String[] args) {
		SpringApplication.run(IntouchApplication.class, args);
	}
	@Override
	public void run(String... args) {
		/*clubDAL.saveClub(new Club(  "Test", "Test"));
		clubDAL.saveClub(new Club("Test", "Test"));

		LOG.info("Getting all data from MongoDB: \n{}",
				clubDAL.getAllClubs());*/

		userDAL.saveUser(new User(  "Test", "Test", "Test", "Test", "Test"));
        userDAL.saveUser(new User(  "Test", "Test", "Test", "Test", "Test"));

        LOG.info("Getting all data from MongoDB: \n{}",
				userDAL.getAllUsers());

		/*LOG.info("Getting paginated data from MongoDB: \n{}",
				personDAL.getAllClubsPaginated(0, 2));
	    */
	}


}
