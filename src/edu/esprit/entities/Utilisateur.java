/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.covoiturage.entities;

import java.sql.Date;

/**
 *
 * @author mm
 */
public class Utilisateur {
    //attribut
    protected int id_user;
    protected String login;
    protected String pwd;
    protected String nom;
    protected String prenom;
    protected String dateDeNaissance;

    public Utilisateur(int id_user, String login, String pwd, String nom, String prenom, String dateDeNaissance) {
        this.id_user = id_user;
        this.login = login;
        this.pwd = pwd;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    
    
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    
    

    public int getId_user() {
        return id_user;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "id_user=" + id_user + ", login=" + login + ", pwd=" + pwd + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + '}';
    }

    
           
}
