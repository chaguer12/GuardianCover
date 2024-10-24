package app.repository.impl;

import app.entity.User;
import app.repository.UserRepoInterface;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository  {
    @PersistenceContext
    private EntityManager em;
//    @Override
//    @Transactional
//    public void save(User user) {
//        em.persist(user);
//
//    }
}
