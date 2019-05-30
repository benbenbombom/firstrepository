package com.itheima.service;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
}
