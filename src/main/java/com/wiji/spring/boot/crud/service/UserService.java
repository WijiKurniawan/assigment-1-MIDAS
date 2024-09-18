package com.wiji.spring.boot.crud.service;

import com.wiji.spring.boot.crud.dto.UserDTO;
import com.wiji.spring.boot.crud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void updateUser(Integer id, User user);

    void deleteUser(Integer id);

    void updateName(Integer id, UserDTO userDTO);
}
