package com.blessonrajanbabu.samples.reactive.service;

import com.blessonrajanbabu.samples.reactive.model.Item;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

import java.time.Duration;

@AllArgsConstructor
public class ItemService {

    private final Duration responseDelay;

    public Mono<Item> createItem(Item item) {
        return Mono.just(item).delayElement(responseDelay);
    }

}
