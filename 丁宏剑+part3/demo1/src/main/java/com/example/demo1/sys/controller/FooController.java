package com.example.demo1.sys.controller;


import com.example.demo1.sys.service.IFooService;
import com.example.demo1.sys.service.impl.FooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-02-04
 */
@Controller
@RequestMapping("/sys/foo")
public class FooController {

    @Autowired
    public FooServiceImpl fooService;

    @RequestMapping("/findGirl")
    public List<Foo> findAll(Foo foo) {
        QueryWrapper<Foo> queryWrapper = new QueryWrapper<>(foo);
        queryWrapper.eq("bar","aaa179");
        return fooService.selectList(queryWrapper);
    }
}

