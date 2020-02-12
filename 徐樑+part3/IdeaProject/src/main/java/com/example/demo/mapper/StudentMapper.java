package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Xl
 * @since 2020-02-09
 */
public interface StudentMapper extends BaseMapper<Student> {

    IPage<Student> selectPage(IPage<Student> studentPage, @Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper);
    List<Student> selectList(@Param(Constants.WRAPPER) QueryWrapper<Student> queryWrapper);

}
