package com.techelevator.dao;

import com.techelevator.model.Menu;

import java.util.List;

public interface MenuDao {
    List<Menu> list();

    Menu getMenuById(long id);

    Menu createMenu(Menu createdMenu);

    boolean updateMenu(long id, Menu menu);

    boolean deleteMenu(long id);
}