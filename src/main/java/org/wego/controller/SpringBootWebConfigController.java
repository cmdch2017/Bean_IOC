package org.wego.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author lst
 * @date 2023年11月09日 15:52
 */
@Component
public class SpringBootWebConfigController {

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void testGetBean1(){
        UserController bean1= (UserController) applicationContext.getBean("userController");
        System.out.println(bean1);
    }
    @PostConstruct
    public void testGetBean2(){
        UserController bean2= applicationContext.getBean(UserController.class);
        System.out.println(bean2);
    }
    @PostConstruct
    public void testGetBean3(){
        UserController bean3= applicationContext.getBean("userController", UserController.class);
        System.out.println(bean3);
    }

}
