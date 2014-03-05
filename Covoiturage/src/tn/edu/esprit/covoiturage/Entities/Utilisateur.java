/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.Entities;

import java.util.Objects;

/**
 *
 * @author amine kh
 */
public class Utilisateur {
    
    
    private String login_utilisateur;
    private String mdp_utilisateur;
    private String nom_utilisateur;
    private String prenom_utilisateur;
    private String date_naiss_utilisateur;
    private String sexe_utilisateur;
    private String tel_utilisateur;
    private int type_utilisateur;
    private int statut_utilisateur;
    private String mail_utilisateur;
    private double note_utlisateur;

    public Utilisateur() {
    }

    public Utilisateur(String login_utilisateur, String mdp_utilisateur, String nom_utilisateur, String prenom_utilisateur, String date_naiss_utilisateur, String sexe_utilisateur, String tel_utilisateur, int type_utilisateur, int statut_utilisateur, String mail_utilisateur, double note_utlisateur) {
        this.login_utilisateur = login_utilisateur;
        this.mdp_utilisateur = mdp_utilisateur;
        this.nom_utilisateur = nom_utilisateur;
        this.prenom_utilisateur = prenom_utilisateur;
        this.date_naiss_utilisateur = date_naiss_utilisateur;
        this.sexe_utilisateur = sexe_utilisateur;
        this.tel_utilisateur = tel_utilisateur;
        this.type_utilisateur = type_utilisateur;
        this.statut_utilisateur = statut_utilisateur;
        this.mail_utilisateur = mail_utilisateur;
        this.note_utlisateur = note_utlisateur;
    }

    public double getNote_utlisateur() {
        return note_utlisateur;
    }

    public void setNote_utlisateur(double note_utlisateur) {
        this.note_utlisateur = note_utlisateur;
    }

  
    public String getLogin_utilisateur() {
        return login_utilisateur;
    }

    public String getMdp_utilisateur() {
        return mdp_utilisateur;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public String getPrenom_utilisateur() {
        return prenom_utilisateur;
    }

    public String getDate_naiss_utilisateur() {
        return date_naiss_utilisateur;
    }

    public String getSexe_utilisateur() {
        return sexe_utilisateur;
    }

    public String getTel_utilisateur() {
        return tel_utilisateur;
    }

    public int getType_utilisateur() {
        return type_utilisateur;
    }

    public int getStatut_utilisateur() {
        return statut_utilisateur;
    }

    public String getMail_utilisateur() {
        return mail_utilisateur;
    }

    

    public void setLogin_utilisateur(String login_utilisateur) {
        this.login_utilisateur = login_utilisateur;
    }

    public void setMdp_utilisateur(String mdp_utilisateur) {
        this.mdp_utilisateur = mdp_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public void setPrenom_utilisateur(String prenom_utilisateur) {
        this.prenom_utilisateur = prenom_utilisateur;
    }

    public void setDate_naiss_utilisateur(String date_naiss_utilisateur) {
        this.date_naiss_utilisateur = date_naiss_utilisateur;
    }

    public void setSexe_utilisateur(String sexe_utilisateur) {
        this.sexe_utilisateur = sexe_utilisateur;
    }

    public void setTel_utilisateur(String tel_utilisateur) {
        this.tel_utilisateur = tel_utilisateur;
    }

    public void setType_utilisateur(int type_utilisateur) {
        this.type_utilisateur = type_utilisateur;
    }

    public void setStatut_utilisateur(int statut_utilisateur) {
        this.statut_utilisateur = statut_utilisateur;
    }

    public void setMail_utilisateur(String mail_utilisateur) {
        this.mail_utilisateur = mail_utilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "login_utilisateur=" + login_utilisateur + ", mdp_utilisateur=" + mdp_utilisateur + ", nom_utilisateur=" + nom_utilisateur + ", prenom_utilisateur=" + prenom_utilisateur + ", date_naiss_utilisateur=" + date_naiss_utilisateur + ", sexe_utilisateur=" + sexe_utilisateur + ", tel_utilisateur=" + tel_utilisateur + ", type_utilisateur=" + type_utilisateur + ", statut_utilisateur=" + statut_utilisateur + ", mail_utilisateur=" + mail_utilisateur + ", note_utlisateur=" + note_utlisateur + '}';
    }

}
