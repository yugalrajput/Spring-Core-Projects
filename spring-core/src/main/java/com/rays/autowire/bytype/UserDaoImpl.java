package com.rays.autowire.bytype;

public class UserDaoImpl implements UserDao {

    @Override
    public void add() {

        System.out.println("UserDaoImpl.add()");
    }
}
