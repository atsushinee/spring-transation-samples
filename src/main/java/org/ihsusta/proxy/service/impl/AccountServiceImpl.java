package org.ihsusta.proxy.service.impl;

import org.ihsusta.proxy.dao.AccountDao;
import org.ihsusta.proxy.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
//        int i =1/0;
        accountDao.outMoney(out, money);
    }
}
