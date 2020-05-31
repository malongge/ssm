package org.demo.service;


import org.demo.bean.Student;
import org.demo.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class StudentService {

    @Resource
    StudentMapper studentMapper;


    public Student getStudentById(Integer id) {
        return Optional.ofNullable(studentMapper.selectByPrimaryKey(id)).orElse(null);
    }
}
