package ru.project.security.services;

import ru.project.security.models.UserDto;

public interface UserService {
    UserDto CreateUser(UserDto userDto);
    UserDto getUserByName(String name);
    boolean checkForExist(String name, String password);
    UserDto getCurrentUser();
}