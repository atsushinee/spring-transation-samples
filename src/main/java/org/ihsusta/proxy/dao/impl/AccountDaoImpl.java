package org.ihsusta.proxy.dao.impl;

import org.ihsusta.proxy.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    public void outMoney(String out, Double money) {
        String sql = "UPDATE account SET money = money - ? WHERE name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    public void inMoney(String in, Double money) {
        String sql = "UPDATE account SET money = money + ? WHERE name =?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
