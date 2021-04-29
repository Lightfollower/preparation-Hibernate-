package com.prepariration.hibernate;

import com.prepariration.hibernate.dao.DAOClass;
import com.prepariration.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        DAOClass daoClass = new DAOClass();
        daoClass.initialize();
        Student student = new Student();
        student.setMark(3F);
        student.setName("Ololosha");
        daoClass.add(student);
        daoClass.delete(3L);
        student.setId(1L);
        student.setName("Batman");
        daoClass.update(student);
        daoClass.getById(4L);
        daoClass.getById(2L);
        daoClass.getAll().forEach(System.out::println);
        for (int i = 0; i < 1000; i++) {
            student = new Student();
            student.setName("ololo " + i);
            student.setMark((float) Math.random() * 5);
            daoClass.add(student);
        }
        daoClass.getAll().forEach(System.out::println);
        daoClass.closeFactory();
    }
}
