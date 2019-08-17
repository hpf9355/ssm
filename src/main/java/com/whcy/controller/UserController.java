package com.whcy.controller;

import com.whcy.model.Person;
import com.whcy.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private Userservice userservice;
    @ResponseBody
    public List<Person>userLogin(){
        return userservice.findUser();
    }
}
