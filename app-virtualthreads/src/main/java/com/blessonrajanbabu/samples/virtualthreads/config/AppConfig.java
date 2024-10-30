package com.blessonrajanbabu.samples.virtualthreads.config;

import com.blessonrajanbabu.samples.virtualthreads.service.ItemService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class AppConfig {

    @Bean
    public ItemService itemService(@Value("${response.delay.ms}") Integer responseDelay) {
        return new ItemService(Duration.ofMillis(responseDelay));
    }

}
