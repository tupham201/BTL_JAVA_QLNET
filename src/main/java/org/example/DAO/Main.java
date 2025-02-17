package org.example.DAO;

import jakarta.persistence.EntityManager;
import org.example.ENTITY.USER.Role;
import org.example.ENTITY.USER.User;
import org.example.SERVICE.UserService;
import org.example.VIEW.TogetherSERVICE.HomeJFrame;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new HomeJFrame().setVisible(true);
        UserService userService = new UserService();
        ArrayList<User> users = userService.SelectAllUser();
        boolean check = false ;
        for(User user : users)
            if(userService.checkAdmin(user)){
                check = true;
                break;
            }
        if(!check)
            userService.addUser(new User("0123456789","Admin","0000",0, Role.ADMIN));
    }
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
}