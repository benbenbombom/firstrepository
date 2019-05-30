package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AccountController {

    // 注入service
    @Autowired
    private AccountService accountService;

    /**
     * 查询全部账户
     */
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        //1. 调用service方法
        List<Account> list = accountService.findAll();
        //2. 返回
        ModelAndView mv = new ModelAndView();
        //2.1 保存数据
        mv.addObject("list",list);
        //2.2 设置跳转的页面名称
        mv.setViewName("list");
        return mv;
    }
}










