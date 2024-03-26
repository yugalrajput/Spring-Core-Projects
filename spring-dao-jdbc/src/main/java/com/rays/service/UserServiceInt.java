package com.rays.service;

import com.rays.dto.UserDTO;

import java.util.List;

public interface UserServiceInt {

    public long add(UserDTO dto);

    public void update(UserDTO dto);

    public void delete(long id);

    public UserDTO findByLogin(String login);

    public UserDTO findByPK(long pk);

    public UserDTO authenticate(String login, String password);

    public List search(UserDTO dto);

    public List search(UserDTO dto, int pageNo, int pageSize);
}
