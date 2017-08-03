package me.inspiringbits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IvanJian on 2017/8/4.
 */
@Controller
public class Test {
    @RequestMapping("/")
    public @ResponseBody String hello(){
        return "indexsdsd";
    }
}
