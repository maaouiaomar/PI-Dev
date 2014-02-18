/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.covoiturage.entities;

import java.util.logging.Logger;

/**
 *
 * @author mm
 */
public class Membre extends Utilisateur {

    //attribut
    protected String sexe;
    protected int tel;

    public Membre(String sexe, int tel, int id_user, String login, String pwd, String nom, String prenom, String dateDeNaissance) {
        super(id_user, login, pwd, nom, prenom, dateDeNaissance);
        this.sexe = sexe;
        this.tel = tel;
    }

    
    
    public String getSexe() {
        return sexe;
    }

    public int getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return super.toString()+"Membre{" + "sexe=" + sexe + ", tel=" + tel + '}';
    }


    
    
}
