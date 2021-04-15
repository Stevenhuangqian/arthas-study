package com.example.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DemoServiceImp implements IDemoService{

    @Override
    public void loop() {
        try {
            for (int i=0;i<1_000_0; i++) {
                Thread.sleep(1L);
                log.info("abcd-----------------------");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i=0;
        if (i>0)
            return;
    }
}
