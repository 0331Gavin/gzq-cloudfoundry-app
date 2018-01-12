package com.example.gzqcloudfoundryapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * create by gzq on 2018/1/6 16:34
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/","/index.html","/index"},method = RequestMethod.GET)
    public String index(){
        return "index";
    }


}
