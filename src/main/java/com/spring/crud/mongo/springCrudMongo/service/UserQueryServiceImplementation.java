package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.repository.UserQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQueryServiceImplementation implements UserQueryService {

    UserQueryRepository queryRepository;


    @Autowired
    public UserQueryServiceImplementation (UserQueryRepository queryRepository){
        this.queryRepository = queryRepository;
    }


    @Override
    public List<User> getQuery1() {
        return queryRepository.getQuery1();
    }

    @Override
    public List<User> getQuery2() {
        return queryRepository.getQuery2();
    }

    @Override
    public List<User> getQuery3() {
        return queryRepository.getQuery3();
    }


}

