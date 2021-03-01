package com.example.demo.controller;


import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/demo")
//@Log4j2
@Log
public class DemoController {


    @GetMapping(value = "/echo")
    public void echo(){
        Long time = System.currentTimeMillis();
        for (int i=0;i<1_000_000; i++) {
            log.info("abcd-----------------------");
        }
        System.out.println(System.currentTimeMillis()-time);
    }

}
