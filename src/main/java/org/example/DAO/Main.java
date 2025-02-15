package org.example.DAO;

import jakarta.persistence.EntityManager;
import org.example.ENTYTI.Order.Hang;
import org.example.ENTYTI.USER.Role;
import org.example.ENTYTI.USER.User;
import org.example.VIEW.TogetherSERVICE.HomeJFrame;
import org.mindrot.jbcrypt.BCrypt;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        new HomeJFrame().setVisible(true);
        User user0 = new User("0123456780","Giàng Seo Chính", BCrypt.hashpw("0000", BCrypt.gensalt()),10000, Role.USER);
        User user = new User("0123456789","Giàng Seo Chính", BCrypt.hashpw("0000", BCrypt.gensalt()),10000, Role.ADMIN);
        Hang hang01 = new Hang("Hang01","Mì tôm Trứng",10000);
        Hang hang02 = new Hang("Hang02","Cơm rang rưa bò",30000);
        Hang hang03 = new Hang("Hang03","Xúc xích",10000);
        Hang hang04 = new Hang("Hang04","Bánh mì",10000);
        Hang hang05 = new Hang("Hang05","Cơm đùi gà",25000);
        Hang hang06 = new Hang("Hang06","Bim bim",8000);
        Hang hang07 = new Hang("Hang07","String",15000);
        Hang hang08 = new Hang("Hang08","Red Bull",20000);
        Hang hang09 = new Hang("Hang09","Trà Đào",10000);
        //Thêm vào CSDL
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.merge(user0);
        entityManager.getTransaction().commit();
    }
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
}