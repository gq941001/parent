package cn.china.provider.service;


import entity.Student;
import mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class MyService {

    @Autowired
    StudentMapper sm;

    @RequestMapping("/hello")
    public String hello(){
        Student student = new Student();
        return "吃饭睡觉";
    }

    @RequestMapping("/selectById")
    public Student selectById(Integer id){
        return sm.selectByPrimarykey(id);
    }
}
