package com.example.demo1.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo1.sys.entity.Foo;
import com.example.demo1.sys.service.IFooService;
import com.example.demo1.sys.service.impl.FooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-02-04
 */
@RestController
@EnableAutoConfiguration
public class FooController {

    @Autowired
    public FooServiceImpl fooService;

    @RequestMapping("/find")
    public List<Foo> findAll(Foo foo) {
        QueryWrapper<Foo> queryWrapper = new QueryWrapper<>(foo);
        queryWrapper.eq("bar","aaa179");
        return fooService.selectList(queryWrapper);
    }
}

