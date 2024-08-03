package com.springboot.backend.usersapp.services;

import com.springboot.backend.usersapp.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> finddById(Long id);

    User save(User user);

    void deleteById(Long id);

}
