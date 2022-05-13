/* 王其康版权所有
 */
package com.wqk;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author wangqikang
 * @version 1.0
 */
  public class BasicDao<T>{
    private QueryRunner queryRunner = new QueryRunner();
    public List<T> queryMulti(String sql, Class<T> claz, Object...parameter) throws Exception {
        Connection connection = null;
        try {

            connection = JdbcDruid.getdata();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(claz), parameter);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(claz), parameter);

        } finally {
            JdbcDruid.close(null, null, connection);
        }
    }
    public int update(Connection connection,String sql,Object...args){

        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;

    }
}