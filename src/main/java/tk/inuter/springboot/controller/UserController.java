package tk.inuter.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.inuter.springboot.pojo.User;
import tk.inuter.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("print")
    public User printUser(Long id, String userName, String notes) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(notes);
        userService.printUser(user);
        return user;
    }
}
