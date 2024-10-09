package com.blessonrajanbabu.samples.virtualthreads.config;

import com.blessonrajanbabu.samples.virtualthreads.service.ItemService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ItemService itemService() {
        return new ItemService();
    }

}
