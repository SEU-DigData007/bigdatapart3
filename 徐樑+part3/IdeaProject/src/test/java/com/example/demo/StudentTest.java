package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RunWith(SpringRunner.class)
@SpringBootTest

public class StudentTest {
    @Autowired
    private StudentMapper studentMapper;

    // 增加一条学生信息
   @Test
    public void insert(){
        Student student = new Student();
        student.setName("李四");
        student.setAge(19);
        student.setHeight(179);
        studentMapper.insert(student);
        System.out.print("增加成功");
    }

    // 根据条件删除
    @Test
    public void delete(){
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("name","李四四");//删除name为张三的数据 如果存在重名 会一起删除..
        studentMapper.deleteByMap(columnMap);
        System.out.print("删除成功");
    }

    // 修改一条学生信息
    @Test
    public void update(){
        Student student = new Student();
        student.setId(3);
        student.setName("张十九");
        student.setAge(21);
        student.setHeight(154);
        studentMapper.updateById(student);
        System.out.print("更新成功");
    }

    // 返回21岁的学生信息
    @Test
    public void selectByMap(){
        Map<String,Object> columnMap= new HashMap<>();
        columnMap.put("age",21);
        List<Student>studentList =  studentMapper.selectByMap(columnMap);
        studentList.forEach(System.out::println);
    }

    // 返回所有学生数据
    @Test
    public void selectList() {
        List<Student> list = studentMapper.selectList(null);
        System.out.println(list);
    }

    // 条件查询  eq等于  ne不等于 gt大于 ge大于等于 lt小于 le小于等于
    // 根据条件返回身高大于等于175的学生信息
    @Test
    public void selectMaps() {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("height",175);
        List<Map<String, Object>> maps = studentMapper.selectMaps(queryWrapper);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    // 分页查询
    @Test
     public void queryStudentForPage(){
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        IPage<Student> studentPage = new Page<>(2, 3);//参数一是当前页，参数二是每页个数
        studentPage = studentMapper.selectPage(studentPage, queryWrapper.ge("age", 18));
        List<Student> list = studentPage.getRecords();
        for(Student student : list){
             System.out.println(student);
        }
     }
}
