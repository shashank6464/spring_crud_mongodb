package com.spring.crud.mongo.springCrudMongo.repository;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserQueryRepository extends MongoRepository<User, String> {


    // 1 => Write a query to find the person whose name is 'Steve'
    @Query("{name:\"Steve\"}")
    List<User> getQuery1();

    // 2 => Write a query to display the fields name, age and phone
    // with only personal and work for all the documents in the collection employee.
    @Query(value = "{}", fields = "{name: 1, age: 1,'phone.personal': 1,'phone.work': 1}")
    List<User> getQuery2();



    // 3 => Write a query to find an employee with the privileges  contain 'min' as three letters
    //  somewhere in his name using regex.
    @Query("{privileges: {$regex : \".*min.*\"}}")
    List<User> getQuery3();




}
