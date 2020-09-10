package tk.inuter.springboot.service.impl;

import org.springframework.stereotype.Service;
import tk.inuter.springboot.pojo.User;
import tk.inuter.springboot.service.UserService;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        Objects.requireNonNull(user);
        System.out.println(user);
    }
}
