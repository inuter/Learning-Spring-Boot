package tk.inuter.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.inuter.springboot.entity.User;

@Mapper
@Component
public interface UserMapper {
    User getUserById(Long id);
    int insertUser(User user);
}
