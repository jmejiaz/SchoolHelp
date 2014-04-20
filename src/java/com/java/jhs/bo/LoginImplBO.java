/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.jhs.bo;

import com.java.jdbc.dao.ImplLogin;
import com.java.jhs.persistence.Login;
import com.java.jsf.bean.BeanLogin;
/**
 *
 * @author juan
 */
public class LoginImplBO implements LoginBO {
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
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
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

