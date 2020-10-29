package ru.guzenko.sbstestproject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.guzenko.sbstestproject.model.Url;

import java.util.List;

@Repository
public class UrlRepositoryImpl implements UrlRepository {

    private static final Logger logger = LoggerFactory.getLogger(UrlRepositoryImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addWords(Url url) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(url);

        logger.info("Words with current URL successfully saved. URL: " + url);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Url> listAllUrls() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Url> urlList = session.createQuery("from Url").list();

        for (Url url : urlList) {
            logger.info("List of words with URL " + url + " successfully loaded.");
        }

        return urlList;
    }
}
