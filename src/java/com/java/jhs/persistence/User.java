package com.java.jhs.persistence;
// Generated 20-abr-2014 21:01:55 by Hibernate Tools 3.2.1.GA



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Long id;
     private String usuario;
     private String password;
     private String mensaje;
     private String status;

    public User() {
    }

    public User(String usuario, String password, String mensaje, String status) {
       this.usuario = usuario;
       this.password = password;
       this.mensaje = mensaje;
       this.status = status;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMensaje() {
        return this.mensaje;
    }
    
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}

