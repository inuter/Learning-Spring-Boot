package tk.inuter.springboot.service;

import tk.inuter.springboot.entity.User;

public interface UserService {
    public User printUser(Long id);

    public int insertUser(User user);
}
