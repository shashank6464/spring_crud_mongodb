package com.spring.crud.mongo.springCrudMongo.contoller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/{username}")
    public List<User> getUserByName(@PathVariable("username") String name){
        return service.findByName(name);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return service.findAllUsers();
    }

    @PostMapping("/saveUser")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        service.saveUser(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{userid}")
    public ResponseEntity<?> deleteUser(@PathVariable("userid") String id){
        service.deleteUserById(id);
        return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);

    }

}
