package com.example.demo.controller;


import com.example.demo.service.IDemoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/demo")
@Log4j2
public class DemoController {


    /**
     * 演示基础的trace命令
     * trace --skipJDKMethod=false com.example.demo.controller.DemoController trace '#cost>100'
     * @throws InterruptedException
     */
    @GetMapping(value = "/trace")
    public void trace() throws InterruptedException {
        Long time = System.currentTimeMillis();
        for (int i=0;i<1_000_0; i++) {
            Thread.sleep(1L);
            log.info("abcd-----------------------");
        }
        System.out.println(System.currentTimeMillis()-time);
    }


    @GetMapping(value = "/trace2")
    public void trace2() throws InterruptedException {
        Long time = System.currentTimeMillis();
        for (int i=0;i<1_000_0; i++) {
            Thread.sleep(1L);
            log.info("abcd-----------------------");
        }
        System.out.println(System.currentTimeMillis()-time);
    }

    @Autowired
    IDemoService demoService;

    /**
     * 用于演示trace 下钻
     * telnet localhost 3658
     * trace com.example.demo.service.IDemoService loop --listenerId 1
     * trace org.apache.logging.log4j.Logger info --listenerId 1
     * @throws InterruptedException
     */
    @GetMapping(value = "/trace3")
    public void trace3() throws InterruptedException {
        Long time = System.currentTimeMillis();
        demoService.loop();
        System.out.println(System.currentTimeMillis()-time);
    }


    

    /**
     * 模拟fullgc触发
     *
     * @throws InterruptedException
     */
    @GetMapping(value = "/vmoption")
    public void vmoption() throws InterruptedException {
        Long time = System.currentTimeMillis();
        for (int i=0;i<1_000_0; i++) {
            Thread.sleep(1L);
            log.info("abcd-----------------------");
        }
        System.out.println(System.currentTimeMillis()-time);
    }


    /**
     * 模拟线程阻塞
     *
     * @throws InterruptedException
     */
    @GetMapping(value = "/thread")
    public void thread() throws InterruptedException {
        Long time = System.currentTimeMillis();
        synchronized (this){
            for (int i=0;i<1_000_0; i++) {
                Thread.sleep(1L);
                log.info("abcd-----------------------");
            }
        }
        System.out.println(System.currentTimeMillis()-time);
    }

}
