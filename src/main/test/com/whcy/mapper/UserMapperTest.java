package com.whcy.mapper;

import com.whcy.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml","classpath:spring/spring*.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    /**
     * 查找用户测试
     */
    @Test
    public void TestFindUser(){
        List<Person> user = userMapper.findUser();
        for (Person person : user) {
            System.out.println("person = " + person.getName());
        }
    }

    /**
     * 添加用户测试
     */
    @Test
    public void TestAddUser(){

        Person person=new Person();
        person.setName("user");
        person.setAge(20);
        person.setAddress("金华");
        person.setCreateTime(new Date());
        person.setUpdateTime(new Date());
        userMapper.addUser(person);
    }

}