package com.prepariration.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClassWithStaticMethodThatReturnSessionFactory {
    public static SessionFactory getSessionFactoryWasOnMyDeskBeforeLunch() {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }
}
