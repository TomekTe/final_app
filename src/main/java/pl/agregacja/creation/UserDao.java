package pl.agregacja.creation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveUser(User user) {
        entityManager.persist(user);
    }
    public User findById(int id) {
        return entityManager.find(User.class, id);
    }

    public void delete(User user) {
        entityManager.persist(user);
    }
    public List<User> findAll(){
        Query query = entityManager.createQuery("SELECT b FROM User b");
        return query.getResultList();
    }
}
