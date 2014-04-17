/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helpschool.jdbc.dao;


import com.helpschool.jhs.persistence.Users;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ImplLogin extends HibernateDaoSupport implements IFaceLogin {
    @Override
    public Users validaLogin(Users obj) {
        List<Object> list = getHibernateTemplate().find("from Login where usuario = ? and password = ?", 
            obj.getName(), obj.getPassword());
        if(list.size() > 0) {
            return (Users) list.get(0);
        }
        return null;
    }

   
}
