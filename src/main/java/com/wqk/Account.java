/* 王其康版权所有
 */
package com.wqk;

/**
 * @author wangqikang
 * @version 1.0
 */
public class Account {
   Integer id;

    public Account() {
    }

    public Account(Integer id) {
        this.id = id;
    }

    public Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }
}

