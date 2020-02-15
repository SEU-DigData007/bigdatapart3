package com.example.demo1.sys.service.impl;

import com.example.demo1.sys.entity.Foo;
import com.example.demo1.sys.mapper.FooMapper;
import com.example.demo1.sys.service.IFooService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-02-04
 */
@Service
public class FooServiceImpl extends ServiceImpl<FooMapper, Foo> implements IFooService {

}
