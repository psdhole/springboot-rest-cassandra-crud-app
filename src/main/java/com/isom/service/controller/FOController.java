package com.isom.service.controller;

import com.datastax.driver.core.utils.UUIDs;
import com.isom.service.dao.IFODao;
import com.isom.service.model.ISOMFulfilment;
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
        log.info("Getting ISOMFulfilment objects list from cassandra database...");
        return (List<ISOMFulfilment>) this.repository.findAll();
    }

    @PostMapping
    public ISOMFulfilment create(@RequestBody ISOMFulfilment isomFulfilment) {
        isomFulfilment.setId(UUIDs.timeBased());
        log.info("Saving ISOMFulfilment object to cassandra database..");
        return this.repository.save(isomFulfilment);
    }

    @DeleteMapping
    public void delete(@RequestBody ISOMFulfilment isomFulfilment) {
        log.info("Deleting ISOMFulfilment object to cassandra database..");
        this.repository.delete(isomFulfilment);
    }

    @PutMapping
    public ISOMFulfilment edit(@RequestBody ISOMFulfilment isomFulfilment) {
        ISOMFulfilment findISOMFulfilment = this.repository.findById(isomFulfilment.getId());
        if (findISOMFulfilment != null) {
            log.info("Updating ISOMFulfilment object to cassandra database..");
            return this.repository.save(isomFulfilment);
        } else throw new RuntimeException("ISOMFulfilment not found with the given id");
    }
}
