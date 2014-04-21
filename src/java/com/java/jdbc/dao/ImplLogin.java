package com.java.jdbc.dao;

import com.java.jhs.persistence.User;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ImplLogin extends HibernateDaoSupport implements IfaceLogin {
    @Override
    public User validaLogin(User obj) {
        List<User> list = getHibernateTemplate().find("from User where usuario = ? and password = ?", 
            obj.getUsuario(), obj.getPassword());
        if(list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
