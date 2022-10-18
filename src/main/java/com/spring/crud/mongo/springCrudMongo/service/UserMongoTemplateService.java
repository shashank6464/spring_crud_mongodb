package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;

import java.util.List;

public interface UserMongoTemplateService {

    List<User> findUserByField(String id, String name, int age, String privilege, int page);

    List<User> findByName(String name);

    List<User> query2();

    List<User> query3();

    List<?> query4();
}