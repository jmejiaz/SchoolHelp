/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.helpschool.jdbc.dao;
import com.helpschool.jhs.persistence.Users;
/**
 *
 * @author Mejia
 */
public interface IFaceLogin {
    Users validaLogin(Users obj);
}
