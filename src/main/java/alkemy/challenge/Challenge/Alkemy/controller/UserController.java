package alkemy.challenge.Challenge.Alkemy.controller;

import alkemy.challenge.Challenge.Alkemy.model.Users;
import alkemy.challenge.Challenge.Alkemy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/POST/auth/sign_up")
    public String create_user(Users users) {
        return "newUser";
    }

}
