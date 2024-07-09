package org.example.restApi;


import org.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restApi {
    @Autowired

    private UserService userService;
@GetMapping("/")
    public String userLogin() {
        userService.logIn();
        return "User logged in";
}
}
