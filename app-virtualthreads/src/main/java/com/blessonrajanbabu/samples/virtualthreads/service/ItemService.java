package com.blessonrajanbabu.samples.virtualthreads.service;

import com.blessonrajanbabu.samples.virtualthreads.model.Item;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor
public class ItemService {

    public Item createItem(Item item) {
        delay(Duration.ofMillis(100));
        return item;
    }

    @SneakyThrows
    private static void delay(Duration duration) {
        TimeUnit.MILLISECONDS.sleep(duration.toMillis());
    }

}
