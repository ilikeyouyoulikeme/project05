/* 王其康版权所有
 */
package com.wqk;



import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author wangqikang
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class AccountDao  extends  BasicDao<Account>{
    public  int insert(Connection connection,Account account)  {
        String sql ="insert into account values(?)";

        return update(connection,sql,account.getId());

    }

    }

