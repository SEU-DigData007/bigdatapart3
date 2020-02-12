package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.mapper.StudentMapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Xl
 * @since 2020-02-09
 */
public interface IStudentService extends IService<Student> {

    /*List<Student> selectList(@Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper);
    IPage<Student> selectPage(IPage<Student> studentPage, @Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper);*/

}
