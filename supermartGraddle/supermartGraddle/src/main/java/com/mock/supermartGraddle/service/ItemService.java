package com.mock.supermartGraddle.service;

import com.mock.supermartGraddle.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> findAll();
    Optional<Item> findById(String id);
    Item insertItem(Item item);
    void insertAllItems(Iterable<Item> item);
    Item updateItem(Item item);
    void deleteItem(Item item);
    void deleteById(String id);
    void deleteAll();
}
