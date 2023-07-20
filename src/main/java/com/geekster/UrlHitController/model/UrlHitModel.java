package com.geekster.UrlHitController.model;

import com.geekster.UrlHitController.service.UrlHitService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UrlHitModel {
    private String username;
    private Integer hitcounter;
}
