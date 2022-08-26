package com.techelevator.controller;

import java.sql.Timestamp;
import java.util.List;

import com.techelevator.dao.TruckDao;
import com.techelevator.model.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TruckController {
    @Autowired
    TruckDao theTruck;

    @GetMapping(path = {"/foodtrucks", "/"})
    public List<Truck> getAllTrucks() {
//        logTimestamp("Getting all trucks");
        List<Truck> allTrucks = theTruck.list();

        return allTrucks;
    }

    @GetMapping("/foodtruck/{id}")
    public Truck getTruckById(@PathVariable int id) {
//        logTimestamp("Returning truck " + id);

        Truck truck = theTruck.getTruckById(id);

        return truck;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/deleteFoodtruck/{id}")
    public void deleteTruckById(@PathVariable int id) {
        theTruck.deleteTruck(id);
//        logTimestamp("Removing truck " + id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/deleteFoodtruck/{name}")
    public void deleteTruckByName(@PathVariable String name) {
        theTruck.deleteTruckByName(name);
//        logTimestamp("Removing truck " + id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addFoodtruck")
    public void addNewTruck(@RequestBody Truck newTruck) {
        theTruck.createTruck(newTruck);
//        logTimestamp("Creating new truck: " + newTruck.getName());
    }

    @PutMapping("/updateFoodtruck/{id}")
    public void updateTruckById(@PathVariable int id, @RequestBody Truck truckToUpdate) {
//        logTimestamp("Updating truck " + id);
        theTruck.update(id, truckToUpdate);
    }

}
