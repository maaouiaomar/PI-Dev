/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import java.sql.Date;

/**
 *
 * @author mm
 */
public class User {
    //attribut
    protected int idUser;
    protected String loginUser;
    protected String pwdUser;
    protected String nomUser;
    protected String prenomUser;
    protected String dateDeNaissanceUser;

    public User(int idUser, String loginUser, String pwdUser, String nomUser, String prenomUser, String dateDeNaissanceUser) {
        this.idUser = idUser;
        this.loginUser = loginUser;
        this.pwdUser = pwdUser;
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.dateDeNaissanceUser = dateDeNaissanceUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getDateDeNaissanceUser() {
        return dateDeNaissanceUser;
    }

    public void setDateDeNaissanceUser(String dateDeNaissanceUser) {
        this.dateDeNaissanceUser = dateDeNaissanceUser;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idUser=" + idUser + ", loginUser=" + loginUser + ", pwdUser=" + pwdUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", dateDeNaissanceUser=" + dateDeNaissanceUser + '}';
    }

  
           
}
