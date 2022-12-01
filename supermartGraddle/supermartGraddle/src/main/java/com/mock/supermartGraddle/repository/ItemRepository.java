package com.mock.supermartGraddle.repository;

import com.mock.supermartGraddle.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}
