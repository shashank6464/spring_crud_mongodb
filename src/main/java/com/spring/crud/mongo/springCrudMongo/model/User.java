package com.spring.crud.mongo.springCrudMongo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


// using for database related mapping
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private String privileges;
    private List<Integer> finished;
    private List<String> badges;

    // phone
    private Phone phone;


    // Points
    private List<Points> points;

    //Favorites
    private Favorites favorites;



    public User(){

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

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorites favorites) {
        this.favorites = favorites;
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
                ", phone=" + phone +
                ", points=" + points +
                ", favorites=" + favorites +
                '}';
    }
}

class Phone{

    private String personal;
    private String work;
    private String ext;

    public Phone(String personal, String work, String ext) {
        this.personal = personal;
        this.work = work;
        this.ext = ext;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}

class Points {

    private int points;
    private int bonus;

    public Points(int points, int bonus) {
        this.points = points;
        this.bonus = bonus;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

class Favorites{

    private String artist;
    private String food;

    public Favorites(String artist, String food) {
        this.artist = artist;
        this.food = food;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
