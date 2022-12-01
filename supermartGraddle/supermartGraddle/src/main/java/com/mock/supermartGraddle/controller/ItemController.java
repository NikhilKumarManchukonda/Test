package com.mock.supermartGraddle.controller;

import com.mock.supermartGraddle.service.ItemService;
import com.mock.supermartGraddle.model.Item;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @GetMapping("/find/all")
    public ResponseEntity<List<Item>> getItems() {
        return ResponseEntity.ok(itemService.findAll());
    }


    @GetMapping("/find/id/{id}")
    public ResponseEntity<Optional<Item>> getItemById(@PathVariable String id) {
        return ResponseEntity.ok(itemService.findById(id));
    }


    @PostMapping("/save")
    public ResponseEntity<Item> saveItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.insertItem(item));
    }


    @PutMapping("/update")
    public ResponseEntity<Item> updateItems(@RequestBody Item item) {
        return ResponseEntity.ok(itemService.updateItem(item));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteItems(@PathVariable String id) {
        itemService.deleteById(id);
        return new ResponseEntity<>("{\"result\":\"success\"}", HttpStatus.OK);
    }
}
