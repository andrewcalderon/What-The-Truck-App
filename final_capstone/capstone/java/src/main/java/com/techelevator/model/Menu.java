package com.techelevator.model;

import javax.validation.constraints.NotEmpty;

public class Menu {
    public Long id;
    @NotEmpty
    public String itemName;
    @NotEmpty
    public String description;
    @NotEmpty
    public long truckId;

    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public long getTruckId() {
        return truckId;
    }
    public void setTruckId(long truckId) {
        this.truckId = truckId;
    }
}