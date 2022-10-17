package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public int countAllUsers() {
        return (int) userRepository.count();
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void saveAllUsers(List<User> users) {
        userRepository.saveAll(users);
    }

    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    // Queries ------------------
    @Override
    public User getByIdQuery(String id){
        return userRepository.getByIdQuery(id);
    }

    @Override
    public List<User> getAndQuery(String privileges, String name){
        return userRepository.getAndQuery(privileges, name);
    }

    @Override
    public Integer countQuery(String privileges){
        return userRepository.countQuery(privileges);
    }

    @Override
    public List<User> sortQuery(String privileges) {
        return userRepository.sortQuery(privileges);
    }

    @Override
    public List<User> regexQuery() {
        return userRepository.regexQuery();
    }

    @Override
    public List<User> showEmbeddedPhone() {
        return userRepository.showEmbeddedPhone();
    }

}
