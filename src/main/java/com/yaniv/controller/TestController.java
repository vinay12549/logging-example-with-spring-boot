package com.yaniv.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        LOGGER.debug("hello debug");
        return "hello world";
    }

}
