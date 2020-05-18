package com.isom.service;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IFODao;
import com.isom.service.dao.IUserDao;
import com.isom.service.model.BusinessUnit;
import com.isom.service.model.ISOMFulfilment;
import com.isom.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private IUserDao userRepository;
    @Autowired
    private IFODao foRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add first entry to the DB.
        this.userRepository.save(new User(UUIDs.timeBased(), "Abc", "Xyz", 31));
        this.foRepository.save(new ISOMFulfilment(UUIDs.timeBased(), 100D, "Xyz", new BusinessUnit("STO", 856L)));
    }
}
