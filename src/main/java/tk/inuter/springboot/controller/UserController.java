package tk.inuter.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.inuter.springboot.entity.User;
import tk.inuter.springboot.enums.GenderEnum;
import tk.inuter.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("print")
    public User printUser(Long id) {
        return userService.printUser(id);
    }

    @GetMapping("insert")
    public Long insertUser(String userName, String gender ,String note) {
        User user = new User();
        user.setUserName(userName);
        user.setGender(GenderEnum.getEnumByName(gender.toUpperCase()));
        user.setNote(note);
        userService.insertUser(user);
        return user.getId();
    }
}
