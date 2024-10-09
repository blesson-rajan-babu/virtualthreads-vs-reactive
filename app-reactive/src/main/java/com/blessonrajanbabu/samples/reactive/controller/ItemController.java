package com.blessonrajanbabu.samples.reactive.controller;

import com.blessonrajanbabu.samples.reactive.model.Item;
import com.blessonrajanbabu.samples.reactive.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public Mono<Item> createItem() {
        log.info("Creating item...");
        return itemService.createItem(Item.random());
    }

}
