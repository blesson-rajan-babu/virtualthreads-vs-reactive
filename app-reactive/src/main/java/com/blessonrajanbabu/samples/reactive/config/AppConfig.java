package com.blessonrajanbabu.samples.reactive.config;

import com.blessonrajanbabu.samples.reactive.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ItemService itemService() {
        return new ItemService();
    }

}
