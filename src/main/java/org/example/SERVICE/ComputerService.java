package org.example.SERVICE;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Computer.Computer;
import org.example.ENTITY.Computer.Status;
import org.example.ENTITY.USER.User;

import java.util.ArrayList;
import java.util.List;

import static org.example.DAO.Main.entityManager;

public class ComputerService {

    public Computer findUserComputer(String phone) {
        entityManager.clear();
        TypedQuery<Computer> query = entityManager.createQuery(
                "SELECT c FROM Computer c WHERE c.user.phone = :phone", Computer.class
        );
        query.setParameter("phone", phone);

        try {
            return query.getSingleResult();  // Lấy đúng 1 kết quả
        } catch (NoResultException e) {
            return null;  // Không tìm thấy trả về null
        }
    }

    public void addComputer(Computer computer){
        entityManager.getTransaction().begin();
        entityManager.merge(computer);
        entityManager.getTransaction().commit();
    }

    public ArrayList<Computer> selectAllComputer(){
        entityManager.clear();
        TypedQuery<Computer> query = entityManager.createQuery("Select c from Computer c", Computer.class);
        return  (ArrayList<Computer>) query.getResultList();
    }

    public void deleteComputer(Computer computer){
        entityManager.getTransaction().begin();
        entityManager.remove(computer);
        entityManager.getTransaction().commit();
    }

    public Computer setNewComputer(String nameTXT, String statusTXT){
        Status status = null;
        for(Status statusCheck : Status.values())
            if(statusCheck.getDescription().equals(statusTXT))
                status = statusCheck;
        if(status == null)
            status = Status.AVAILABLE;
        return new Computer(nameTXT,status);
    }

    public Computer findComputer(String nameComputer){
        entityManager.clear();
        return entityManager.find(Computer.class,nameComputer);
    }
}
