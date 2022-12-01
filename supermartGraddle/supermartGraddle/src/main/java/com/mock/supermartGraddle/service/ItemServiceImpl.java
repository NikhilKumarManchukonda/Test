package com.mock.supermartGraddle.service;

import com.mock.supermartGraddle.model.Item;
import com.mock.supermartGraddle.repository.ItemRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> findById(String id) {
        return itemRepository.findById(id);
    }

    @Override
    public Item insertItem(Item item) {
        return itemRepository.insert(item);
    }

    @Override
    public void insertAllItems(Iterable<Item> items) {
        itemRepository.insert(items);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public void deleteById(String id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        itemRepository.deleteAll();
    }
}

