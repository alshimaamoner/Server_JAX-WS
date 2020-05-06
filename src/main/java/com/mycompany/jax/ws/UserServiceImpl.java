package com.mycompany.jax.ws;

public class UserServiceImpl implements UserService {

    @Override
    public float getNetSalary(User user) {
        //System.out.println("Net Salary  !!");
        return user.getSalary() +user.getBonus() -user.getDeduction();

    }
    
}
