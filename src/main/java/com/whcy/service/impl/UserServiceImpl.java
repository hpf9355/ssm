package com.whcy.service.impl;

import com.whcy.mapper.UserMapper;
import com.whcy.model.Person;
import com.whcy.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements Userservice {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Person> findUser() {
        return userMapper.findUser();

    }

    public void addUser(Person person) {

    }
   /* @Autowired
    private UserMapper userMapper;
*/


}
