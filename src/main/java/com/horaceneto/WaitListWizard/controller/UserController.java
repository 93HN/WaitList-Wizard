package com.horaceneto.WaitListWizard.controller;
import com.horaceneto.WaitListWizard.model.User;
import com.horaceneto.WaitListWizard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<> (createdUser, HttpStatus.CREATED);
    }


}
