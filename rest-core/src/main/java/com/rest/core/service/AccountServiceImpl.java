package com.rest.core.service;

import com.rest.api.request.params.CreateAccountParams;
import com.rest.core.dao.AccountRepository;
import com.rest.core.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository repository;

    public Long create(CreateAccountParams params) {
        Account account = new Account();
        account.setLogin(params.getLogin());
        account.setPassword(params.getPassword());
        return repository.saveAndFlush(account).getId();
    }
}
