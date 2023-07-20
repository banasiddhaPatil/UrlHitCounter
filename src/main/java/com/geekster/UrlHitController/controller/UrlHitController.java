package com.geekster.UrlHitController.controller;

import com.geekster.UrlHitController.model.UrlHitModel;
import com.geekster.UrlHitController.service.UrlHitService;
import jdk.internal.icu.text.UnicodeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="api/v1/visitor-count-app/{username}",method = RequestMethod.GET)
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService;
    @GetMapping("count")
    public Map<String,Integer> getHitCount() {
          return urlHitService.getProducts();
    }

    @GetMapping(value = "urlhit")
    public String getProducts() {
        return "Url_is_Hiteded";
    }
  }



