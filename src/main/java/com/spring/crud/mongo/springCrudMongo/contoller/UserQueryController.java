package com.spring.crud.mongo.springCrudMongo.contoller;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.service.UserQueryService;
import com.spring.crud.mongo.springCrudMongo.service.UserQueryServiceImplementation;
import com.spring.crud.mongo.springCrudMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/queries")
public class UserQueryController {

    @Autowired
    UserQueryService queryService;


    @GetMapping("/getQuery1")
    public List<User> getQuery1() {
        return queryService.getQuery1();
    }

    @GetMapping("/getQuery2")
    public List<User> getQuery2() {
        return queryService.getQuery2();
    }

    @GetMapping("/getQuery3")
    public List<User> getQuery3() {
        return queryService.getQuery3();
    }

//    @GetMapping("/getQuery5")
//    public String getQuery5() {
//        return queryService.getQuery5();
//    }



}