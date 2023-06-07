package cc.lexur.db.mapper;

import cc.lexur.db.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    void addUser(@Param("user") User user);
}
