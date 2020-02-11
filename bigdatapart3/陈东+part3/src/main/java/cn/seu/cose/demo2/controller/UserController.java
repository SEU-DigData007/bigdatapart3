package cn.seu.cose.demo2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.seu.cose.demo2.entity.UserEntity;
import cn.seu.cose.demo2.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.github.pagehelper.PageHelper;

@RestController
public class UserController{
    @Autowired
    private UserService userService;
    @RequestMapping("/userlist")
    public List<UserEntity> queryList(){
        PageHelper.startPage(1, 2);

        return userService.queryList();
    }

    //通过id找
    @RequestMapping("/queryUser")
    public UserEntity queryUserEntity(String id){
        UserEntity userEntity=userService.findById(id);
        return userEntity;
    }

    //通过类插入
    @RequestMapping("/insert")
    public int insertEntity() {
        return userService.insertEntity();
    }

    //通过参数插入
    @RequestMapping("/insertParam")
    public int insertParam() {
        return userService.insertParam();
    }


    @RequestMapping("/updateEntity")
    public int updateEntity() {
        return userService.updateEntity();
    }

    @RequestMapping("/deleteEntity")
    public int deleteEntity() {
        return userService.deleteEntity();
    }
}
