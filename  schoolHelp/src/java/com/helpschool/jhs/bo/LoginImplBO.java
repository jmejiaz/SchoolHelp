/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helpschool.jhs.bo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.helpschool.jdbc.dao.ImplLogin;
import com.helpschool.jhs.persistence.Users;
import com.helpschool.jsf.bean.BeanLogin;
/**
 *
 * @author SergioRios
 */
public class LoginImplBO implements ILoginBO {
    private ImplLogin loginDAO;
    /**
     * @return the loginDAO
     */
    public ImplLogin getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ImplLogin loginDAO) {
        this.loginDAO = loginDAO;
    }
    
    @Override
    public void validaLogin(BeanLogin obj) {
        Users login = new Users();
        login.setName(obj.getNombre());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        if(login != null) {
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        } else {
            obj.setStatus(false);
            obj.setMensaje("El usuario no existe");
        }
    }
}

