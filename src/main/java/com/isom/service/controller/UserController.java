package com.isom.service.controller;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IUserDao;
import com.isom.service.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController(value = "/api/v1/users")
public class UserController {

  @Autowired private IUserDao repository;

  @RequestMapping
  public List<User> getAll() {
    log.info("User list is checking from cassandra");
    return (List<User>) this.repository.findAll();
  }

  @RequestMapping(method = RequestMethod.POST)
  public User create(@RequestBody User user) {
    user.setId(UUIDs.timeBased());
    log.info("User save process has started.");
    return this.repository.save(user);
  }

  @RequestMapping(method = RequestMethod.DELETE)
  public void delete(@RequestBody User user) {
    log.info("User delete process has started.");
    this.repository.delete(user);
  }

  @RequestMapping(method = RequestMethod.PUT)
  public User edit(@RequestBody User user) {
    User findUser = this.repository.findById(user.getId());
    if (findUser != null) {
      log.info("User update process has started.");
      return this.repository.save(user);
    } else throw new RuntimeException("User not found");
  }
}
