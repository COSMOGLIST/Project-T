package ru.project.gateway.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.security.models.UserDto;
import ru.project.security.services.UserService;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationUserController {

    private final UserService userService;
    @Autowired
    public RegistrationUserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public UserDto creation(@Valid @RequestBody UserDto userDto) throws Exception {
        if (userService.getUserByName(userDto.getName()) != null) {
            throw new Exception("This username already exists");
        }
        return userService.CreateUser(userDto);
    }

    @PostMapping("/authorization")
    public UserDto getUser(@RequestBody UserDto userDto) throws Exception {
        if (userService.checkForExist(userDto.getName(), userDto.getPassword())) {
            return userService.getUserByName(userDto.getName());
        } else {
            throw new Exception("No such user");
        }

    }
}