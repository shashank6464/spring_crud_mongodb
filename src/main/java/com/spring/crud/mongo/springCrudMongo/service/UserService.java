package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> findByName(String name);

    List<User> findAllUsers();

    User saveUser(User user);

    void deleteUserById(String id);
}
