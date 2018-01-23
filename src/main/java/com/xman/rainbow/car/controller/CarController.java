package com.xman.rainbow.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/driver")
public class CarController {


    @RequestMapping(value = "/getDriverOnline", method = RequestMethod.GET)
    @ResponseBody
    public String getDriverOnline(){
        System.out.println("======================hello world");
        return "hello ";
    }
}
