package com.helpschool.jsf.bean;

import com.helpschool.jhs.bo.LoginImplBO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class BeanLogin {
    private String mensaje;
    private Boolean status;
    private String user;
    private String password;
    private String nombre;
    private Integer edad;

    private List<BeanLogin> listaUsuarios;
    private LoginImplBO loginBO;
    
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

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
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
        System.out.println("User : "+getUser());
        System.out.println("Password : "+getPassword());
 
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
        if(this.getStatus()) {
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<BeanLogin>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            sessionMap.put("usuarioLogeado", this);
            if(getUser().equals("Sergio")) {
                return "alumnos/alumno";
            } else if(getUser().equals("Java")) {
                return "menu";
            }
        } else {
            return "login";
        }
        return "login";
    }

 
}
