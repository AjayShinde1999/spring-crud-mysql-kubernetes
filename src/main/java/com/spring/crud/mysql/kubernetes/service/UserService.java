package com.spring.crud.mysql.kubernetes.service;


import com.spring.crud.mysql.kubernetes.model.User;

import java.util.List;

public interface UserService {

    public User saveOneUser(User user);

    public List<User> getAllUser();

    public User getById(Integer id);

    public void deleteUser(Integer id);

    public User updateUser(User user,Integer id);
}
