package com.example.demo.repo;

import com.example.demo.domain.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemRepo extends MongoRepository<Item,Integer> {
    List<Item> findByType(int i);
}
