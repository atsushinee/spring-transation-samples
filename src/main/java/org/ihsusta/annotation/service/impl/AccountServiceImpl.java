package org.ihsusta.annotation.service.impl;

import org.ihsusta.annotation.dao.AccountDao;
import org.ihsusta.annotation.service.AccountService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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
