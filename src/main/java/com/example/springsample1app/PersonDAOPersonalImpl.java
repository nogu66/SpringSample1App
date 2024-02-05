package com.example.springsample1app;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class PersonDAOPersonalImpl implements PersonDAO<Person> {
    private static final Long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    public PersonDAOPersonalImpl() {
        super();
    }

    @Override
    public List<Person> getAll() {
        Query query = entityManager.createQuery("from Person");
        @SuppressWarnings("unchecked")
        List<Person> list = query.getResultList();
        entityManager.close();
        return list;
    }

    @Override
    public Person findById(long id) {
        return (Person) entityManager.createQuery("from Person where id = " + id).getSingleResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> findByName(String name) {
        return (List<Person>) entityManager.createQuery("from Person where name = " + name).getResultList();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> findByAge(int min, int max) {
        return (List<Person>) entityManager.createNamedQuery("findByAge").setParameter("min", min).setParameter("max", max).getResultList();
    }

    @Override
    public List<Person> find(String fstr) {
        List<Person> list = null;
        Query query = entityManager.createNamedQuery("findWithName").setParameter("fname", "%"+fstr+"%");
        list = query.getResultList();
        return list;
    }
}
