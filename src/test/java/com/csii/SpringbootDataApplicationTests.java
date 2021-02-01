package com.csii;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class SpringbootDataApplicationTests {

    @Autowired
    DataSource DataSource;

    @Test
    void contextLoads() throws Exception{
        System.err.println(DataSource.getClass());
        Connection connection = DataSource.getConnection();
        DruidDataSource druidDataSource = (DruidDataSource)DataSource;
        System.out.println(druidDataSource.getInitialSize());
        System.err.println(connection);
        connection.close();
    }

}
