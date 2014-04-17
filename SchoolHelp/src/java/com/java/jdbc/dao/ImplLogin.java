package com.java.jdbc.dao;

import com.java.jhs.persistence.Login;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ImplLogin extends HibernateDaoSupport implements IfaceLogin {
    @Override
    public Login validaLogin(Login obj) {
        List<Login> list = getHibernateTemplate().find("from Login where user = ? and password = ?", 
            obj.getUsuario(), obj.getPassword());
        if(list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
