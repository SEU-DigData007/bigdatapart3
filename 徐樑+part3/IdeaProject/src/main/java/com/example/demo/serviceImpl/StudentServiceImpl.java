package com.example.demo.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Xl
 * @since 2020-02-09
 */
@Service
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    /*public List<Student> selectList(@Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper) {
        return studentMapper.selectList(queryWrapper);
    }
    public IPage<Student> selectPage(IPage<Student> studentPage, @Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper) {
        return studentMapper.selectPage(studentPage,queryWrapper);
    }*/


}