package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.repository.UserMongoTemplateRepository;
import com.spring.crud.mongo.springCrudMongo.repository.UserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMongoTemplateServiceImplementation implements UserMongoTemplateService{

    @Autowired
    UserMongoTemplateRepository mongoTemplateRepository;


    public UserMongoTemplateServiceImplementation (UserMongoTemplateRepository mongoTemplateRepository){
        this.mongoTemplateRepository = mongoTemplateRepository;
    }

    // page: 1 => 15 records
    @Override
    public List<User> findUserByField(String id, String name, int age, String privilege, int page) {
        return mongoTemplateRepository.findUserByField(id, name, age, privilege, PageRequest.of(page,1));
    }

    @Override
    public List<User> findByName(String name) {
        return mongoTemplateRepository.findByName(name);
    }

    @Override
    public List<User> query2() {
        return mongoTemplateRepository.query2();
    }

    @Override
    public List<User> query3() {
        return mongoTemplateRepository.query3();
    }

    @Override
    public List<?> query4() {
        return mongoTemplateRepository.query4();
    }
}
