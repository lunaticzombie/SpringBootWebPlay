package com.nijamrit.SpringBootWebPlay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

//@Controller // Returns Page Name
@RestController // Return Data
public class HomeController {

    // Note: we can create multiple controllers. Spring has an inbuild Front controller layer that distributes the request to appropriate controller

    @RequestMapping("/")
    // @ResponseBody // Either use RestController on Class OR use ResponseBody on Method
    public String welcome() {
        return "Namaste !!";
    }

    @RequestMapping("/session")
    public String checkSessionId(HttpServletRequest request) {
        return "Session Id: " + request.getSession().getId();
    }
}
