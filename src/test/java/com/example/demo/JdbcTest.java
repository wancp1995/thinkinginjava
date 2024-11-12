package com.example.demo;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentRowMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Test
//    public void queryTest(){
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from student");
//        System.out.println(list.size());
//        Assert.assertNotNull(list);
//        Assert.assertEquals(1, list.size());
//    }


}
