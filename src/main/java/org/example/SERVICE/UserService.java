package org.example.SERVICE;

import jakarta.persistence.TypedQuery;
import org.example.ENTITY.USER.Role;
import org.example.ENTITY.USER.User;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Arrays;

import static org.example.DAO.Main.entityManager;

public class UserService {

    public boolean checkAdmin(User user){
        return user.getRole().equals(Role.ADMIN);
    }

    public User findUser(String  phone){
       return entityManager.find(User.class,phone);
    }

    public void addUser(User user){
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }

    public User setUser(User user, String newPhone, String newName, char[] newPass){
        User newUser = new User(newPhone,newName,BCrypt.hashpw(String.valueOf(newPass), BCrypt.gensalt()),
                user.getMoney(), user.getRole());
        Arrays.fill(newPass,'\0');
        return newUser;
    }

    public void deleteUser(User user){
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }

    public boolean checkPAss (char[] pass1, char[] pass2) {
        return Arrays.equals(pass1,pass2);
    }

    public ArrayList<User> SelectAllUser(){
        entityManager.clear();
        TypedQuery<User> query = entityManager.createQuery("Select c From User c", User.class);
        ArrayList<User> users = new ArrayList<>();
        users = (ArrayList<User>) query.getResultList();
        return users;
    }

}
