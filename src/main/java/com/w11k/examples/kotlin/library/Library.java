package com.w11k.examples.kotlin.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Item> catalog = new ArrayList<>();

    public Library() {
    }

    public Library(List<Item> catalog) {
        this.catalog = catalog;
    }

    public Library addItem(Item item) {
        this.catalog.add(item);
        return this;
    }

    public List<Item> getCatalog() {
        return this.catalog.stream().collect(Collectors.toList());
    }
}
