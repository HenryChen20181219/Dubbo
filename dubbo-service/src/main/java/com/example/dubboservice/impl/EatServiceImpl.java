package com.example.dubboservice.impl;

import com.example.dao.Fruit;
import com.example.service.EatService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class EatServiceImpl implements EatService {

    @Override
    public String eatFruitByFruitName(String fruitName) {
        return "frultName:" + fruitName;
    }

    @Override
    public String isEating(Fruit fruit) {
        if (fruit==null){
            return "notEating";
        }
        else {
            return "isEating";
        }
    }

    @Override
    public String getFruitByName(String fruitName) {
        Fruit fruit = new Fruit(fruitName);
        return isEating(fruit);
    }
}
