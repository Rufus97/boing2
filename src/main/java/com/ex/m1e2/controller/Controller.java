package com.ex.m1e2.controller;

import com.ex.m1e2.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/")
    public String hello() {
        return "Hello User!";
    }

    @GetMapping("/month")
    public Month getMoth() {
        return (Month) request.getAttribute("month");
    }

}
