package com.blessonrajanbabu.samples.virtualthreads.controller;

import com.blessonrajanbabu.samples.virtualthreads.model.Item;
import com.blessonrajanbabu.samples.virtualthreads.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public Item createItem() {
        log.info("Creating item...");
        return itemService.createItem(Item.random());
    }

}
