package com.example.service;

import com.example.dao.Fruit;

public interface EatService {
    String eatFruitByFruitName(String fruitName);

    String isEating(Fruit fruit);

    String getFruitByName(String fruitName);
}
