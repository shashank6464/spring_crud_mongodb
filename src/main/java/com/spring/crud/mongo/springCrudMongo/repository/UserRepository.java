package com.spring.crud.mongo.springCrudMongo.repository;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByName(String name);

    // List<User> findAllUsers();

    // Queries -------------------

    @Query("{name: \"?0\"}")
    public User getByIdQuery(String id);


    //@Query("{ $and : [{privileges:\"?0\"}, {name:\"?1\"}]}")
    @Query(value = "{privileges : ?0, name : ?1}", fields = "{badges:1, privileges:1}")
    public List<User> getAndQuery(String privileges, String name);

    @Query( value = "{privileges : ?0}", count = true)
    public Integer countQuery(String privileges);

    @Query(value = "{privileges: ?0}", sort = "{name:1}")
    List<User> sortQuery(@Param("privileges") String privileges);


    @Query("{privileges: {$regex : \".*min.*\"}}")
    List<User> regexQuery();


    @Query(value = "{}", fields = "{name:1, age:1, 'phone.personal':1, 'phone.work':1}")
    List<User> showEmbeddedPhone();



}
