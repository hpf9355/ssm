package com.whcy.mapper;

import com.whcy.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {


    /**
     * 用户测试
     * @return
     */
     List<Person> findUser();

     void addUser(Person person);


}
