package com.geekster.UrlHitController.repositroy;
import com.geekster.UrlHitController.model.UrlHitModel;
import com.geekster.UrlHitController.service.UrlHitService;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.geekster.UrlHitController.configuration.BeanManager;

import java.util.List;
import java.util.Map;
@Repository
public class repo {
    @Autowired
    public Map<String,Integer> products ;

    public Map<String,Integer> getProductList() {
            return products;
        }
}
