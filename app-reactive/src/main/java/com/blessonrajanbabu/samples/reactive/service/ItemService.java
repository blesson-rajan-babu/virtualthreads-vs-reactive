package com.blessonrajanbabu.samples.reactive.service;

import com.blessonrajanbabu.samples.reactive.model.Item;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

import java.time.Duration;

@NoArgsConstructor
public class ItemService {

    public Mono<Item> createItem(Item item) {
        return Mono.just(item).delayElement(Duration.ofMillis(100));
    }

}
