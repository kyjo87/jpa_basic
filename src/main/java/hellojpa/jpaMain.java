package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            Member member = new Member();

            member.setId(1L);
            member.setName("HelloJPA");

            em.persist(member);
        } catch (Exception e) {

        }

        tx.commit();
        em.close();
        /*종료 15:00*/
        emf.close();
    }
}
