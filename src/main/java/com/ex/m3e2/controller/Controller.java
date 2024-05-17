package com.ex.m3e2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class Controller {

    @Autowired
    private Environment env;

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String devName() {
        String toReturn = "Hello";
        logger.debug("devName Controller response: {}", toReturn);
        return toReturn;
    }

    @GetMapping("/exp")
    public Double exponetial() {
        StringBuilder stringBuilder = new StringBuilder();
        Integer val1 = Integer.parseInt(env.getProperty("val1"));
        Integer val2 = Integer.parseInt(env.getProperty("val2"));
        logger.trace("time start val1: {}", LocalTime.now());
        Double toReturn = Math.pow(val1, val2);
        logger.trace("end time {}", LocalTime.now());
        return toReturn;
    }
}
