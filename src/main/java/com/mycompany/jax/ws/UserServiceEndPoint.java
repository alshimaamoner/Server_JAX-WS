/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jax.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;


@WebService(serviceName = "UserService",targetNamespace = "http://ws.jax.mycompany.com/")
public class UserServiceEndPoint {
    @Autowired
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

 
    @WebMethod
    public float getNetSalary(User user)
    {
        return userService.getNetSalary(user);
    }

//    @WebMethod
//    
//    public void x()
//    {
//        System.out.println("Hello World");
//    }
}
