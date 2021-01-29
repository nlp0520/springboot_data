package com.csii;

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
        System.err.println(connection);
        connection.close();
    }

}
