package com.csii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Auther:niulipeng
 * @Date:2021/1/29
 * @Description:com.csii.controller
 * @Version:1.0
 */

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate JdbcTemplate;

    @RequestMapping("/cityList")
    public List cityList(){
        String sql = "select * from city";
        List<Map<String, Object>> list = JdbcTemplate.queryForList(sql);
        return list;
    }

}
