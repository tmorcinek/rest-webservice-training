package com.morcinek.server.database;

import com.google.inject.Singleton;
import com.morcinek.server.model.Author;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * By Tomasz Morcinek in 2014.
 */
@Singleton
public class AuthorManager {

    private EntityManager entityManager;

    @Inject
    public AuthorManager(EntityManager entityManager) {
        this.entityManager = entityManager;
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(new Author("Tomasz", "Morcinek", "tomasz.morcinek@gmail.com", "tmorcinek.wordpress.com"));
        transaction.commit();
    }

    public List<Author> getAllAuthors(){
        TypedQuery<Author> typedQuery = entityManager.createQuery("SELECT a FROM Author a", Author.class);
        return typedQuery.getResultList();
    }
}
