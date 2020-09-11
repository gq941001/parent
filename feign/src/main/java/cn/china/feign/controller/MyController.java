package cn.china.feign.controller;

import cn.china.feign.inter.MyInterface;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyInterface mi;

    @RequestMapping("/hello")
    public String my(){
        return mi.hello();
    }

    @RequestMapping(value = "/selectById" ,produces = "application/json;charset=utf-8" )
    public Student selectById(){
        return mi.selectById(4);
    }

}
