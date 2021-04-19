package com.cgrpg.controller;

import com.cgrpg.model.User;
import com.cgrpg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public String hello(){
        List<User> users = userRepository.findAll();
        if(! users.isEmpty()){
            return "There are " + users.size() + " in the DB";
        }
        return "no user found";
    }

    @GetMapping(value="/{name}")
    public User findByName(@PathVariable final String name){
        return userRepository.findByUsername(name);
    }

    @PostMapping(value="/register")
    public User register(@RequestBody final User user){
        return userRepository.save(user);
    }

}