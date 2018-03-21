package com.example.demo.service;

import com.example.demo.po.TbNsBssUserInfoBh;

public interface UserService {

    TbNsBssUserInfoBh findUser(int pageNum, int pageSize);
}
