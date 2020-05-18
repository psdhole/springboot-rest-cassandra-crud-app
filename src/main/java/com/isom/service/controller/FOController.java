package com.isom.service.controller;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IFODao;
import com.isom.service.model.ISOMFulfilment;
import com.isom.service.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/fo")
public class FOController {

    @Autowired
    private IFODao repository;

    @GetMapping
    public List<ISOMFulfilment> getAll() {
        log.info("User list is checking from cassandra");
        return (List<ISOMFulfilment>) this.repository.findAll();
    }

    @PostMapping
    public ISOMFulfilment create(@RequestBody ISOMFulfilment isomFulfilment) {
        isomFulfilment.setId(UUIDs.timeBased());
        log.info("User save process has started.");
        return this.repository.save(isomFulfilment);
    }

    @DeleteMapping
    public void delete(@RequestBody ISOMFulfilment isomFulfilment) {
        log.info("User delete process has started.");
        this.repository.delete(isomFulfilment);
    }

    @PutMapping
    public ISOMFulfilment edit(@RequestBody ISOMFulfilment isomFulfilment) {
        User findUser = this.repository.findById(isomFulfilment.getId());
        if (findUser != null) {
            log.info("User update process has started.");
            return this.repository.save(isomFulfilment);
        } else throw new RuntimeException("User not found");
    }
}
