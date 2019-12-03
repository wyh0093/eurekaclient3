package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eurekaclient3
 * @description:
 * @author: Yunhuan Wang
 * @create: 2019/12/3 15:44
 **/
@RestController
public class TestController {
    @RequestMapping("/aaa")
    public String aaa(@RequestParam(name = "name") String name){
        return name;
    }

}
