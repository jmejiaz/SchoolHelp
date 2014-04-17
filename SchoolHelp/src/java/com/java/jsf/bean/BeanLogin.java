package com.java.jsf.bean;

import com.java.jhs.bo.LoginImplBO;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class BeanLogin {
    private Integer id;
    private String usuario;
    private String password;
    private String mensaje;
    private Boolean status; 
    private List<BeanLogin> listaUsuarios;
    private LoginImplBO loginBO;
    

    /**
     * @return the user
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param ususario the user to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the listaUsuarios
     */
    public List<BeanLogin> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<BeanLogin> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    /**
     * @return the loginBO
     */
    public LoginImplBO getLoginBO() {
        return loginBO;
    }

    /**
     * @param loginBO the loginBO to set
     */
    public void setLoginBO(LoginImplBO loginBO) {
        this.loginBO = loginBO;
    }
    
    public String validarLogin() {
        System.out.println("User : "+getUsuario());
        System.out.println("Password : "+getPassword());
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
        if(this.getStatus()) {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<BeanLogin>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            sessionMap.put("usuarioLogeado", this);
            if(getUsuario().equals("Sergio")) {
                return "portfolio";
            } else if(getUsuario().equals("Java")) {
                return "index";
            }
        } else {
            return "login";
        }
        return "login";
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

  
}

