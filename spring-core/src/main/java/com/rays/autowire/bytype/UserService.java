package com.rays.autowire.bytype;

public class UserService {

    private UserDao userDao;

    public void setUserDAO(UserDao userDao) {
        this.userDao = userDao;
    }

    public void testAdd() {
        userDao.add();
    }
}
