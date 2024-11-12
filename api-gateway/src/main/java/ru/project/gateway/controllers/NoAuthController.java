package ru.project.gateway.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.project.gateway.services.TechnologyServiceUser;
import ru.project.models.TechnologyDto;
import ru.project.security.models.UserDto;
import ru.project.security.services.UserService;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class NoAuthController {

    private final UserService userService;
    private final TechnologyServiceUser technologyServiceUser;
    @Autowired
    public NoAuthController(UserService userService, TechnologyServiceUser technologyServiceUser) {
        this.userService = userService;
        this.technologyServiceUser = technologyServiceUser;
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

    @GetMapping("/radar")
    public List<TechnologyDto> getByCriteria(@RequestParam(name = "id", required = false) String id,
                                             @RequestParam(name = "name", required = false) String name,
                                             @RequestParam(name = "technologyType", required = false) String technologyType,
                                             @RequestParam(name = "rang", required = false) String rang) {
        return technologyServiceUser.getByCriteria(id, name, technologyType, rang);
    }
}