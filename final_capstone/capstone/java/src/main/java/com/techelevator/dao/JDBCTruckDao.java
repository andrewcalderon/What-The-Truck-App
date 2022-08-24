package com.techelevator.dao;

import com.techelevator.model.Truck;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCTruckDao implements TruckDao{

    private JdbcTemplate jdbcTemplate;

    public JDBCTruckDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Truck> list() {
        List<Truck> trucks = new ArrayList<>();
        String listOfTrucks = "Select * FROM trucks";

        SqlRowSet results = jdbcTemplate.queryForRowSet(listOfTrucks);
        while(results.next()) {
            Truck truck = mapRowToTruck(results);
            trucks.add(truck);
        }
        return trucks;
    }

    @Override
    public Truck getTruckById(long id) {
        Truck truck = null;
        String truckById = "SELECT * FROM trucks WHERE id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(truckById, id);
        if (results.next()) {
            truck = mapRowToTruck(results);}
//        } else {
//            throw new TruckNotFoundException();
//        }
        return truck;
    }

    @Override
    public boolean update(long id, Truck changedTruck) {
        String updatedRow = "UPDATE trucks SET name = ?, online = ?, logo = ?, user_id = ?, WHERE id = ?";
        return jdbcTemplate.update(updatedRow, changedTruck.getName(), changedTruck.isOnline(), changedTruck.getLogo(), changedTruck.getUserId(), id) == 1;
    }

    @Override
    public Truck createTruck(Truck truck) {
        String createdTruck = "INSERT INTO trucks (name, online, logo, userId) VALUES (?, ?, ?, ?) RETURNING id;";
        long id = jdbcTemplate.queryForObject(createdTruck, Integer.class, truck.getName(), truck.isOnline(), truck.getLogo(), truck.getUserId());
        truck.setId(id);
        return truck;
    }

    @Override
    public boolean deleteTruck(long id) {
        String deletedTruck = "DELETE FROM trucks WHERE id = ?";
        return jdbcTemplate.update(deletedTruck, id) == 1;
    }


    private Truck mapRowToTruck(SqlRowSet rowSet) {
        Truck truck = new Truck();
        truck.setId(rowSet.getLong("id"));
        truck.setName(rowSet.getString("name"));
        truck.setOnline(rowSet.getBoolean("online"));
        truck.setLogo(rowSet.getString("logo"));
        truck.setUserId(rowSet.getLong("user_id"));
        return truck;
    }
}
