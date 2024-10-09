package com.blessonrajanbabu.samples.reactive.model;

import java.util.UUID;

public record Item(String id, String name) {

    public static Item random() {
        return new Item(UUID.randomUUID().toString(), UUID.randomUUID().toString());
    }

}
