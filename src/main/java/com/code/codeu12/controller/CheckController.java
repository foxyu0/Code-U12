package com.code.codeu12.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("check")
public class CheckController {


    @GetMapping(path = "/check/{id}")
    public String rss(@PathVariable("id") String id) {

        System.out.println(id);
        return id;
    }
}
