package com.ye.dao;

import com.ye.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
//    private SessionFactory sessionFactory;
private HibernateTemplate hibernateTemplate;
//    private Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }

//    public List<User> getList() {
//        String sql = "from User";
//        Query query = getSession().createQuery(sql);
//        List list = query.list();
//        return list;
//    }

    public List<User> getList() {
        String sql = "from User";
        List<User> list = (List<User>)hibernateTemplate.find(sql, new Object[]{});
        return list;
    }
}
