package com.prepariration.hibernate.dao;

import com.prepariration.hibernate.ClassWithStaticMethodThatReturnSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DAOClass {
    SessionFactory sessionFactory;
    Session session = null;

    public void initialize() {
        sessionFactory = ClassWithStaticMethodThatReturnSessionFactory.getSessionFactoryWasOnMyDeskBeforeLunch();
    }

    public Session getSession() {
        return session;
    }
}
