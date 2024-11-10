package ru.project.gateway.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.security.models.UserDto;
import ru.project.security.services.UserService;

@RestController
@RequestMapping("/registration")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationUserController {

    private final UserService userService;
    @Autowired
    public RegistrationUserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDto creation(@Valid @RequestBody UserDto userDto) {
        return userService.CreateUser(userDto);
    }
}