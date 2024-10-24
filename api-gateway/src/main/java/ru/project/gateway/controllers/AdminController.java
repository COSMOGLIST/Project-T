package ru.project.gateway.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.project.gateway.services.TechnologyServiceAdmin;
import ru.project.gateway.services.TechnologyServiceUser;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final TechnologyServiceAdmin technologyServiceAdmin;
    private final TechnologyServiceUser technologyServiceUser;

    public AdminController(TechnologyServiceAdmin technologyServiceAdmin, TechnologyServiceUser technologyServiceUser) {
        this.technologyServiceAdmin = technologyServiceAdmin;
        this.technologyServiceUser = technologyServiceUser;
    }
}