package cn.china.provider2.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class MyService {

    @RequestMapping("/hello")
    public String hello(){
        return "打豆豆";
    }



}
