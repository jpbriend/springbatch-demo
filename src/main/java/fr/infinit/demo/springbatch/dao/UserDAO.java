package fr.infinit.demo.springbatch.dao;

import fr.infinit.demo.springbatch.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * User: Jean-Philippe Briend
 * Date: 5/15/11
 * Time: 5:21 PM
 */
@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    public User saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
        return user;
    }

}
