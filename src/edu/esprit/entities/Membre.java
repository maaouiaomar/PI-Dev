/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import java.util.logging.Logger;

/**
 *
 * @author mm
 */
public class Membre extends User {

    //attribut
    protected String sexeMembre;
    protected int telMembre;

    public Membre(String sexeMembre, int telMembre, int idUser, String loginUser, String pwdUser, String nomUser, String prenomUser, String dateDeNaissanceUser) {
        super(idUser, loginUser, pwdUser, nomUser, prenomUser, dateDeNaissanceUser);
        this.sexeMembre = sexeMembre;
        this.telMembre = telMembre;
    }

   

    public String getSexeMembre() {
        return sexeMembre;
    }

    public void setSexeMembre(String sexeMembre) {
        this.sexeMembre = sexeMembre;
    }

    public int getTelMembre() {
        return telMembre;
    }

    public void setTelMmembre(int telMembre) {
        this.telMembre = telMembre;
    }

    @Override
    public String toString() {
        return super.toString()+"Membre{" + "sexeMembre=" + sexeMembre + ", telMembre=" + telMembre + '}';
    }

   
    
    
}
