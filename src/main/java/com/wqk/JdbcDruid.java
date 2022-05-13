/* 王其康版权所有
 */
package com.wqk;

/**
 * @author wangqikang
 * @version 1.0
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JdbcDruid {
    private static DruidDataSource ds;
    static {

        try {
            Properties pros = new Properties();
            InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pros.load(is);
            ds =(DruidDataSource) DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }




    }


    public static Connection getdata() throws Exception {
     Connection conn =null;
     conn = ds.getConnection();
     return conn;

    }


    public static void close(ResultSet set, Statement statement, Connection connection) throws SQLException {
        if(set != null){
            set.close();
        }
        if(statement != null){
            statement.close();
        }
        if(connection != null){
            connection.close();
        }

    }

}


