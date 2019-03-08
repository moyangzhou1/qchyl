package com.tpcz.qchyl.service.impl;


import com.tpcz.qchyl.dao.UserDao;
import com.tpcz.qchyl.domain.User;
import com.tpcz.qchyl.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: todo
 * @author: myz
 * @createtime: 2019/2/26$ 13:29$
 */
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")//使用注解配置，将id为“userDao”的bean注入到“userDaoImpl”里面
    private UserDao userDaoImpl;//定义dao层的“接口”

    @Override
    public List<User> selectUserList() {
        return userDaoImpl.selectUserList();
    }
}
