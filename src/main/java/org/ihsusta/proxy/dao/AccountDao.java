package org.ihsusta.proxy.dao;

public interface AccountDao {

    void outMoney(String out, Double money);

    void inMoney(String in, Double money);
}
