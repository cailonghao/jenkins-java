package com.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cainiao
 * @program: jenkins
 * @description:
 * @create: 2020-01-15 13:20
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/test1")
    public Map<String,Object> test1(){
        Map<String,Object> map = new HashMap<>();
        map.put("test1","测试发布成功");
        return map;
    }
}
