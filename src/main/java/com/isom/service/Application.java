package com.isom.service;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IUserDao;
import com.isom.service.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired private IUserDao repository;

  @Override
  public void run(String... args) throws Exception {
    // Add first entry to the DB.
    this.repository.save(new User(UUIDs.timeBased(), "Abc", "Xyz", 31));
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
