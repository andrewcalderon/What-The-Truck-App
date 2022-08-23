package com.techelevator.dao;

import com.techelevator.model.Menu;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCMenuDao implements MenuDao {
    private JdbcTemplate jdbcTemplate;

    public JDBCMenuDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Menu> list() {
        List<Menu> menus = new ArrayList<>();
        String listOfTrucks = "Select * FROM truck";

        SqlRowSet results = jdbcTemplate.queryForRowSet(listOfTrucks);
        while(results.next()) {
            Menu menu = mapRowToMenu(results);
            menus.add(menu);
        }
        return menus;
    }

    @Override
    public Menu getMenuById(long id) {
        Menu menu = null;
        String menuById = "SELECT * FROM menu WHERE id = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(menuById, id);
        if (results.next()) {
            menu = mapRowToMenu(results);}
//        } else {
//            throw new TruckNotFoundException();
//        }
        return menu;
    }

    @Override
    public boolean updateMenu(long id, Menu changedMenu) {
        String updatedRow = "UPDATE truck SET name = ?, online = ?, logo = ?, user_id = ?, WHERE id = ?";
        return jdbcTemplate.update(updatedRow, changedMenu.getItemName(), changedMenu.getDescription(), changedMenu.getTruckId(), id) == 1;
    }

    @Override
    public Menu createMenu(Menu menu) {
        String createdMenu= "INSERT INTO truck (name, online, logo, userId) VALUES (?, ?, ?, ?) RETURNING id;";
        long id = jdbcTemplate.queryForObject(createdMenu, Integer.class, menu.getItemName(), menu.getDescription(), menu.getTruckId());
        menu.setId(id);
        return menu;
    }

    @Override
    public boolean deleteMenu(long id) {
        String deletedTruck = "DELETE FROM truck WHERE id = ?";
        return jdbcTemplate.update(deletedTruck, id) == 1;
    }


    private Menu mapRowToMenu(SqlRowSet rowSet) {
        Menu menu = new Menu();
        menu.setId(rowSet.getLong("id"));
        menu.setItemName(rowSet.getString("item_name"));
        menu.setDescription(rowSet.getString("description"));
        menu.setTruckId(rowSet.getLong("user_id"));
        return menu;
    }
}