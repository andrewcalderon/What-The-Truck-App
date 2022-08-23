package com.techelevator.dao;

import com.techelevator.model.Truck;

import java.util.List;

public interface TruckDao {

    List<Truck> list();

    Truck getTruckById(long id);

    Truck createTruck(Truck createdTruck);

    boolean update(long id, Truck truck);

    boolean deleteTruck(long id);
}
