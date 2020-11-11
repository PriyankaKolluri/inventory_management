package com.purpletrendz.inventory.controller;

import com.purpletrendz.inventory.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("inventory-management/item-details")
    public Item getItemDetails(){

        Item item = new Item();

        item.setItemId("12345");
        item.setItemName("T-shirt");
        item.setItemDescription("Men T shirt");
        item.setColor("Red");
        item.setModel("Long Sleeves");
        item.setSize("S");
        item.setQuantity(12);

        return item;
    }
}
