package org.example;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public Inventory() {
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public void remove(Item item) {
        this.items.remove(item);
    }

    public boolean contains(Item item) {
        return this.items.contains(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Item item: this.items) {
            stringBuilder
                    .append(item.getName())
                    .append("\n");
        }

        return stringBuilder.toString();
    }
}
