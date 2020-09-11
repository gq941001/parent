package mapper;

import entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//mapper代表以前的dao层,一切功能能从mapper加
public interface StudentMapper {


    int insert(Student student);

    int insertList(List<Student> list);

    Student selectByPrimarykey(Integer id);

    List<Student> selectByName(String name);

    List<Student> selectByNameAndAge(@Param("name") String name, @Param("age") Integer age);

}
