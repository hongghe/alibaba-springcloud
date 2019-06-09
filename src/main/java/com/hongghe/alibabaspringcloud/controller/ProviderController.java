package com.hongghe.alibabaspringcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "provider")
public class ProviderController {

    @RequestMapping(value = "hello")
    public String hello() {
        return "hello";
    }
}
