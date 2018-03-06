package com.modianli.credit.api.controller;

import com.google.common.collect.Lists;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/index")
public class IndexController {

  @GetMapping("/cache")
  @Cacheable(value = "index", key = "'haha'")
  public List<String> index(){
    return Lists.newArrayList("1", "2", "3");
  }
}
