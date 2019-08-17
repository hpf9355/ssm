package com.whcy.service;

import com.whcy.model.Person;

import java.util.List;

public interface Userservice {

     List<Person>findUser();
     void addUser(Person person);
}
