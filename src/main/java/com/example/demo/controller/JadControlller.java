package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/jad")
@Log4j2
public class JadControlller {
    /**
     * 用于演示jad跟redefine、retransform
     */
    @GetMapping(value = "/jad")
    public void trace()  {
        System.out.println(System.currentTimeMillis());
    }
}
