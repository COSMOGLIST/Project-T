package ru.project.gateway.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.gateway.services.TechnologyServiceUser;

@RestController
@RequestMapping("/user")
public class UserController {
    private final TechnologyServiceUser technologyServiceUser;

    public UserController(TechnologyServiceUser technologyServiceUser) {
        this.technologyServiceUser = technologyServiceUser;
    }
}
