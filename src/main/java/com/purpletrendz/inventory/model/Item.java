package com.purpletrendz.inventory.model;

public class Item {

    private String itemId;
    private String itemName;
    private String itemDescription;
    private String color;
    private Integer quantity;
    private String size;
    private String model;

    public Item(){

    }

    public Item(String itemId, String itemName, String itemDescription, String color, Integer quantity, String size, String model){

        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.color = color;
        this.quantity = quantity;
        this.size = size;
        this.model = model;

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
