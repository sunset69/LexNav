package cc.lexur.db;

import cc.lexur.db.mapper.UserMapper;
import cc.lexur.db.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void mapperTest() {
        User user = new User();
        user.setUsername("hello11");
        user.setPassword("world11");
        userMapper.insert(user);
    }

}
