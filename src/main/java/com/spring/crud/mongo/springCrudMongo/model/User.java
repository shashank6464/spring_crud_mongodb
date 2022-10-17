package com.spring.crud.mongo.springCrudMongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "user")
public class User {

    @Id
    private String id;

    private String name;
    private int age;

    private String privileges;
    private List<Integer> finished;

    private List<String> badges;

    public User() {
    }

    public User(String id, String name, int age, List<Integer> finished, List<String> badges) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.finished = finished;
        this.badges = badges;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public List<Integer> getFinished() {
        return finished;
    }

    public void setFinished(List<Integer> finished) {
        this.finished = finished;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", privileges='" + privileges + '\'' +
                ", finished=" + finished +
                ", badges=" + badges +
                '}';
    }

    //    "name": "Sue",
//            "age": 19,
//            "phone": {
//        "personal": "555-123-123",
//                "work": "555-456-456",
//                "ext": "2342"


}
