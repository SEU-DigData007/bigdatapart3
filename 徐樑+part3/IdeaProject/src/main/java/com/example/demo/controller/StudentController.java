package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import com.example.demo.serviceImpl.StudentServiceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xl
 * @since 2020-02-09
 */
@RestController
@EnableAutoConfiguration
public class StudentController {
    @Autowired
    private IStudentService studentService;
    /*// 分页查询
    @RequestMapping("/findByAge")
    public List<Student> findStudent(Student student) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>(student);
        queryWrapper.eq("age",21);
        return studentService.selectList(queryWrapper);
    }
    @RequestMapping("/findPage/{pageNo}/{pageSize}")
    public IPage<Student> findByPage(@Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        IPage<Student> studentPage = new Page<>(pageNo,pageSize);// 参数一是当前页，参数二是每页个数
        studentPage = studentService.selectPage(studentPage, queryWrapper.ge("age", 18));
        return studentPage;
    }*/
}
