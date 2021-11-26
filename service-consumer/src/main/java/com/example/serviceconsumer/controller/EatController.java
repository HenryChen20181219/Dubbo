package com.example.serviceconsumer.controller;

import com.example.dao.Fruit;
import com.example.service.EatService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/eat")
public class EatController {

    @DubboReference
    private EatService eatService;

    @GetMapping("/eatFruit")
    public ResponseEntity<String> sayHello(@RequestParam("fruitName") String fruitName) {
        return ResponseEntity.ok(eatService.eatFruitByFruitName(fruitName));
    }

    @GetMapping("/isEating")
    public ResponseEntity<String> isEating(@RequestParam("Fruit") Fruit fruit) {
        return ResponseEntity.ok(eatService.isEating(fruit));
    }

    @GetMapping("/getFruitByName")
    public ResponseEntity<String> getFruitByName(@RequestParam("fruitName") String fruitName) {
        return ResponseEntity.ok(eatService.getFruitByName(fruitName));
    }
}
