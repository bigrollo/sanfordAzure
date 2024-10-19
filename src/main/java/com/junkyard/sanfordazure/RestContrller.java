package com.junkyard.sanfordazure;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContrller {

    @GetMapping("/")
    public String index(){

        return "HEY MARC!!";
    }
}
