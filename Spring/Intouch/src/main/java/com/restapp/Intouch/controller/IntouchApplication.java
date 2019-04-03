package com.restapp.Intouch;

import com.restapp.Intouch.dal.ClubDal;
import com.restapp.Intouch.models.Club;
import com.restapp.Intouch.controller.ClubRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class IntouchApplication implements CommandLineRunner{


	private final ClubRepository repo;
	private final ClubDal clubDAL;

	@Autowired
	public IntouchApplication(ClubRepository repo, ClubDal clubDAL){
		this.clubDAL = clubDAL;
	}

	private static final Logger LOG = LoggerFactory.getLogger("IntouchApplication");

	public static void main(String[] args) {
		SpringApplication.run(IntouchApplication.class, args);
	}
	@Override
	public void run(String... args) {
		clubDAL.saveClub(new Club(  "Test", "Test"));
		clubDAL.saveClub(new Club("Test", "Test"));

		LOG.info("Getting all data from MongoDB: \n{}",
				clubDAL.getAllClubs());

		/*LOG.info("Getting paginated data from MongoDB: \n{}",
				personDAL.getAllPersonPaginated(0, 2));
		LOG.info("Getting person By name 'Sergey': {}",
				personDAL.findByName("Sergey"));
		LOG.info("Getting all person By name 'Sergey': {}",
				personDAL.findOneByName("Sergey"));
		LOG.info("Getting people between age 22 & 26: {}",
				personDAL.findByAgeRange(22, 26));*/
	}

}
