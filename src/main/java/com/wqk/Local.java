/* 王其康版权所有
 */
package com.wqk;

import java.sql.Connection;

/**
 * @author wangqikang
 * @version 1.0
 */
public class Local  extends  ThreadLocal<Connection> {
    Connection connection =null;
    public Connection  createConnection() throws Exception {
        if(connection == null){
            connection = JdbcDruid.getdata();
            ThreadLocal.
        }


    }

}
