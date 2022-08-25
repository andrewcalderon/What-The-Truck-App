package com.techelevator.model;

import javax.validation.constraints.NotEmpty;

public class Truck {
    public Long id;
    @NotEmpty
    public String name;
    @NotEmpty
    public boolean online;
    @NotEmpty
    public Long userId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }
    public void setOnline(boolean online) {
        this.online = online;
    }

//    public String getLogo() {
//        return logo;
//    }
//    public void setLogo(String logo) {
//        this.logo = logo;
//    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
}