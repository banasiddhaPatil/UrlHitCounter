package com.geekster.UrlHitController.service;

import com.geekster.UrlHitController.model.UrlHitModel;
import com.geekster.UrlHitController.repositroy.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class UrlHitService {
    @Autowired
    repo productRepo;
    public void urlhit(){
        System.out.print("Url is Hiteded");
        return;
    }

    public Map<String,Integer> getProducts() {
        return productRepo.getProductList();
    }

}
