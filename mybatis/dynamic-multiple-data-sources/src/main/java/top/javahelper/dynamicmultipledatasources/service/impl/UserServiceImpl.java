package top.javahelper.dynamicmultipledatasources.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.javahelper.dynamicmultipledatasources.mapper.UserMapper;
import top.javahelper.dynamicmultipledatasources.model.User;
import top.javahelper.dynamicmultipledatasources.service.UserService;

import java.util.List;

/**
 * @description:
 * @projectName:dynamic-multiple-data-sources
 * @see:top.javahelper.dynamicmultipledatasources.service.impl
 * @author:郑晓龙
 * @createTime:2021/12/6 16:29
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
