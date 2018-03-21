package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TbNsBssUserInfoBhMapper;
import com.example.demo.po.TbNsBssUserInfoBh;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbNsBssUserInfoBhMapper bhMapper;

    @Override
    public TbNsBssUserInfoBh findUser(int pageNum, int pageSize) {
        // 将参数传给这个方法就可以实现物理分页了，非常简单。
        // PageHelper.startPage(pageNum, pageSize);
        return bhMapper.selectByPrimaryKey("331011626000159");
    }

}
