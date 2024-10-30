package com.blessonrajanbabu.samples.virtualthreads.service;

import com.blessonrajanbabu.samples.virtualthreads.model.Item;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class ItemService {

    private final Duration responseDelay;

    public Item createItem(Item item) {
        delay(responseDelay);
        return item;
    }

    @SneakyThrows
    private static void delay(Duration duration) {
        TimeUnit.MILLISECONDS.sleep(duration.toMillis());
    }

}
