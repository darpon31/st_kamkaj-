package com.darpon.rest.spring.restspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserRes {

    @Autowired
    private UserDao userDao;


    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userDao.findAll();

    }

    @GetMapping("/users/{id}")
    public User retrieveSpecificUsers(@PathVariable int id){
        return userDao.findOne(id);

    }

    @DeleteMapping("/users/{id}")
    public void deleteSpecificUsers(@PathVariable int id){
        User user= userDao.delete(id);

       // return userDao.delete(id);

    }



    //Create
    //input details of users
    // output created user
@PostMapping("/users")
    public void createUser(@RequestBody User user){
        User savedUser= userDao.save(user);

        //create
        //uri/{id}


//    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
//            .toUri();







    }
}
