package cn.seu.cose.demo2.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import cn.seu.cose.demo2.entity.UserEntity;


public interface UserMapper {
    @Select("select * from user")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "contact", column = "contact") })
    public List<UserEntity> queryList();

    @Select("SELECT * FROM USER WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "contact", column = "contact") })
    UserEntity findById(String id);

    //通过类插入
    @Insert("insert into user values(#{id},#{name},#{contact})")
    public int insertEntity(UserEntity entity);

    //通过参数插入
    @Insert("INSERT INTO USER VALUES(#{id}, #{name},#{contact})")
    int insertParam(@Param("id") String id,@Param("name") String name, @Param("contact") String contact);

    @Update("UPDATE user SET name=#{name} WHERE id=#{id}")
    int updateEntity(UserEntity user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    int deleteEntity(UserEntity entity);
}
