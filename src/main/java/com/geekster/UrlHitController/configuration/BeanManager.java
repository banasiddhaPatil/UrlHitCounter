package com.geekster.UrlHitController.configuration;


import com.geekster.UrlHitController.model.UrlHitModel;
import com.geekster.UrlHitController.service.UrlHitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.*;

@Configuration
public class BeanManager {

    @Bean
    public Map<String,Integer> getInitializedList()
    {
        Map<String,Integer> initUser = new HashMap<>();
        UrlHitService urlHitService=new UrlHitService();
        initUser.put("Bansiddha",2);

        return initUser;
    }
}
