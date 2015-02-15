package za.co.discovery.vitality.rsa.badges.service;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.discovery.vitality.rsa.badges.domain.UserLookup;

import javax.annotation.Resource;

@Service("loginService")
@Transactional
public class LoginService {

    protected static Logger logger = Logger.getLogger("service");

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    /**
     * Search DB for login username
     */
    public UserLookup getByUsername(String username) {
        // Retrieve session from Hibernate
        Session session = sessionFactory.getCurrentSession();
        String SQL_QUERY = " from UserLookup where username='" + username + "'";
        Query query = session.createQuery(SQL_QUERY);
        logger.debug("returning existing user");
        if (query.list() == null)
            return null;
        if (query.list().isEmpty())
            return null;
        try {
            query.list().get(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
        return (UserLookup) query.list().get(0);
    }

}