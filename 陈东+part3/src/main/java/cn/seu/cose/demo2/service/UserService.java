package cn.seu.cose.demo2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.seu.cose.demo2.dao.UserMapper;
import cn.seu.cose.demo2.entity.UserEntity;


@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper mapper;

    public List<UserEntity> queryList(){
        List<UserEntity> userList=mapper.queryList();
        return userList;
    }

    public UserEntity findById(String id){
        System.out.println("userId:"+id);
        return mapper.findById(id);
    }

    public int insertEntity() {
        UserEntity entity=new UserEntity();
        entity.setId("555");
        entity.setName("wuwu");
        entity.setContact("15555555");
        return mapper.insertEntity(entity);
    }

    public int insertParam() {
        return mapper.insertParam("666","sisisi","166666666");
    }


    public int updateEntity() {
        UserEntity entity=new UserEntity();
        entity.setId("555");
        entity.setName("hhh");
        return mapper.updateEntity(entity);
    }

    public int deleteEntity() {
        UserEntity entity=new UserEntity();
        entity.setId("555");
        return mapper.deleteEntity(entity);
    }
}
