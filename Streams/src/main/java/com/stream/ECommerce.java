package com.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class ECommerce{
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    static class Item {
        private int id;
        private String itemName;
        private double price;
        private int quantity;
    }

    public static List<Item> getItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "shirt", 100, 2));
        items.add(new Item(2, "shoes", 3800, 1));
        items.add(new Item(3, "pants", 1500, 3));
        items.add(new Item(4, "hat", 70, 5));
        items.add(new Item(5, "jacket", 1250, 1));
        return items;
    }

}
