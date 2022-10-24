package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.model.User;
import peaksoft.util.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;


public class UserDaoHibernateImpl implements UserDao {
    private final SessionFactory sessionFactory = Hibernate.createSessionFactory();
    private final EntityManagerFactory entityManagerFactory = Hibernate.createEntityManagerFactory();


    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.createSQLQuery("""
                create table if not exists users(
                id serial primary key,
                name varchar(50) not null,
                lastName varchar(50) not null,
                age smallint not null)""").executeUpdate();
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public void dropUsersTable() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.createNativeQuery("drop table if exists users").executeUpdate();

        session.getTransaction().commit();
        session.close();
        System.out.println("SUCCESSFULLY");


    }

        @Override
        public void saveUser(String name, String lastName, byte age) {
                Session session = sessionFactory.openSession();
                session.getTransaction().begin();
                session.persist(new User(name,lastName,age));
                session.getTransaction().commit();
                session.close();


        }

    @Override
    public void removeUserById(long id) {
        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            User user = entityManager.find(User.class, id);
            entityManager.remove(user);
            entityManager.getTransaction().commit();
            entityManager.close();

        } catch (Exception exception) {
            System.out.println("error Id");
        }

    }

    @Override
    public List<User> getAllUsers() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            List <User> users = session.createQuery("select c from User c")
                    .getResultList();

            session.getTransaction().commit();
            session.close();
            return users;
        } catch (Exception e) {
            System.out.println("get all users error");
        }

        return getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.createSQLQuery("truncate table users").executeUpdate();

            session.getTransaction().commit();
            session.close();

        } catch (Exception exception) {
            System.out.println("exception cleanUsersTable");

        }
    }


}

