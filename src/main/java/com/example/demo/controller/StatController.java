//package com.example.demo.controller;
//
//import lombok.extern.java.Log;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Log
//public class StatController {
//
//    @RequestMapping(value = "/api/stat")
//    @ResponseBody
//    public Map<String, Object> execute(@RequestParam(value = "ip", required = true) String ip,
//                                       @RequestParam(value = "version", required = true) String version,
//                                       @RequestParam(value = "command", required = true) String command,
//                                       @RequestParam(value = "arguments", required = false, defaultValue = "") String arguments) {
//
//        log.info("arthas stat, ip: {}, version: {}, command: {}, arguments: {}", ip, version, command, arguments);
//
//        Map<String, Object> result = new HashMap<>();
//
//        result.put("success", true);
//
//        return result;
//    }
//}