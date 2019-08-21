package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询 所有账户...");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存 帐户...");
        accountDao.saveAccount(account);
    }
}
