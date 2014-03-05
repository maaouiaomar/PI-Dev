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
public class Annonce {
    
    private String libele_annonce;  
    private int nbr_passager_annonce;
    private int prix_annonce;
    private String type_annonce;
    private String type_trajet_annonce;
    private int fumeur_annonce;       
    private int music_annonce;       
    private int bagage_annonce;       
    private int animaux_annonce;       
    private String heure_depart_annonce;        
    private String date_depart_annonce;
    private int climatisation_annonce;      
    private int confort_annonce;        
    private String login_conducteur;      
    private String login_position_depart;       
    private String login_position_arrive;
    private String login_position_arret1;
    private String login_position_arret2;
    private String login_position_arret3;
    private String login_position_arret4;
    private String login_position_arret5;
    private String login_position_arret6;
    private int etat_annonce;

    

    public Annonce() {
    }

    public Annonce(String libele_annonce, int nbr_passager_annonce, int prix_annonce, String type_annonce, String type_trajet_annonce, int fumeur_annonce, int music_annonce, int bagage_annonce, int animaux_annonce, String heure_depart_annonce, String date_depart_annonce, int climatisation_annonce, int confort_annonce, String login_conducteur, String login_position_depart, String login_position_arrive, String login_position_arret1, String login_position_arret2, String login_position_arret3, String login_position_arret4, String login_position_arret5, String login_position_arret6, int etat_annonce) {
        this.libele_annonce = libele_annonce;
        this.nbr_passager_annonce = nbr_passager_annonce;
        this.prix_annonce = prix_annonce;
        this.type_annonce = type_annonce;
        this.type_trajet_annonce = type_trajet_annonce;
        this.fumeur_annonce = fumeur_annonce;
        this.music_annonce = music_annonce;
        this.bagage_annonce = bagage_annonce;
        this.animaux_annonce = animaux_annonce;
        this.heure_depart_annonce = heure_depart_annonce;
        this.date_depart_annonce = date_depart_annonce;
        this.climatisation_annonce = climatisation_annonce;
        this.confort_annonce = confort_annonce;
        this.login_conducteur = login_conducteur;
        this.login_position_depart = login_position_depart;
        this.login_position_arrive = login_position_arrive;
        this.login_position_arret1 = login_position_arret1;
        this.login_position_arret2 = login_position_arret2;
        this.login_position_arret3 = login_position_arret3;
        this.login_position_arret4 = login_position_arret4;
        this.login_position_arret5 = login_position_arret5;
        this.login_position_arret6 = login_position_arret6;
        this.etat_annonce = etat_annonce;
    }

    public String getLibele_annonce() {
        return libele_annonce;
    }

    public void setLibele_annonce(String libele_annonce) {
        this.libele_annonce = libele_annonce;
    }

    public int getNbr_passager_annonce() {
        return nbr_passager_annonce;
    }

    public void setNbr_passager_annonce(int nbr_passager_annonce) {
        this.nbr_passager_annonce = nbr_passager_annonce;
    }

    public int getPrix_annonce() {
        return prix_annonce;
    }

    public void setPrix_annonce(int prix_annonce) {
        this.prix_annonce = prix_annonce;
    }

    public String getType_annonce() {
        return type_annonce;
    }

    public void setType_annonce(String type_annonce) {
        this.type_annonce = type_annonce;
    }

    public String getType_trajet_annonce() {
        return type_trajet_annonce;
    }

    public void setType_trajet_annonce(String type_trajet_annonce) {
        this.type_trajet_annonce = type_trajet_annonce;
    }

    public int getFumeur_annonce() {
        return fumeur_annonce;
    }

    public void setFumeur_annonce(int fumeur_annonce) {
        this.fumeur_annonce = fumeur_annonce;
    }

    public int getMusic_annonce() {
        return music_annonce;
    }

    public void setMusic_annonce(int music_annonce) {
        this.music_annonce = music_annonce;
    }

    public int getBagage_annonce() {
        return bagage_annonce;
    }

    public void setBagage_annonce(int bagage_annonce) {
        this.bagage_annonce = bagage_annonce;
    }

    public int getAnimaux_annonce() {
        return animaux_annonce;
    }

    public void setAnimaux_annonce(int animaux_annonce) {
        this.animaux_annonce = animaux_annonce;
    }

    public String getHeure_depart_annonce() {
        return heure_depart_annonce;
    }

    public void setHeure_depart_annonce(String heure_depart_annonce) {
        this.heure_depart_annonce = heure_depart_annonce;
    }

    public String getDate_depart_annonce() {
        return date_depart_annonce;
    }

    public void setDate_depart_annonce(String date_depart_annonce) {
        this.date_depart_annonce = date_depart_annonce;
    }

    public int getClimatisation_annonce() {
        return climatisation_annonce;
    }

    public void setClimatisation_annonce(int climatisation_annonce) {
        this.climatisation_annonce = climatisation_annonce;
    }

    public int getConfort_annonce() {
        return confort_annonce;
    }

    public void setConfort_annonce(int confort_annonce) {
        this.confort_annonce = confort_annonce;
    }

    public String getLogin_conducteur() {
        return login_conducteur;
    }

    public void setLogin_conducteur(String login_conducteur) {
        this.login_conducteur = login_conducteur;
    }

    public String getLogin_position_depart() {
        return login_position_depart;
    }

    public void setLogin_position_depart(String login_position_depart) {
        this.login_position_depart = login_position_depart;
    }

    public String getLogin_position_arrive() {
        return login_position_arrive;
    }

    public void setLogin_position_arrive(String login_position_arrive) {
        this.login_position_arrive = login_position_arrive;
    }

    public String getLogin_position_arret1() {
        return login_position_arret1;
    }

    public void setLogin_position_arret1(String login_position_arret1) {
        this.login_position_arret1 = login_position_arret1;
    }

    public String getLogin_position_arret2() {
        return login_position_arret2;
    }

    public void setLogin_position_arret2(String login_position_arret2) {
        this.login_position_arret2 = login_position_arret2;
    }

    public String getLogin_position_arret3() {
        return login_position_arret3;
    }

    public void setLogin_position_arret3(String login_position_arret3) {
        this.login_position_arret3 = login_position_arret3;
    }

    public String getLogin_position_arret4() {
        return login_position_arret4;
    }

    public void setLogin_position_arret4(String login_position_arret4) {
        this.login_position_arret4 = login_position_arret4;
    }

    public String getLogin_position_arret5() {
        return login_position_arret5;
    }

    public void setLogin_position_arret5(String login_position_arret5) {
        this.login_position_arret5 = login_position_arret5;
    }

    public String getLogin_position_arret6() {
        return login_position_arret6;
    }

    public void setLogin_position_arret6(String login_position_arret6) {
        this.login_position_arret6 = login_position_arret6;
    }

    public int getEtat_annonce() {
        return etat_annonce;
    }

    public void setEtat_annonce(int etat_annonce) {
        this.etat_annonce = etat_annonce;
    }

    @Override
    public String toString() {
        return "Annonce{" + "libele_annonce=" + libele_annonce + ", nbr_passager_annonce=" + nbr_passager_annonce + ", prix_annonce=" + prix_annonce + ", type_annonce=" + type_annonce + ", type_trajet_annonce=" + type_trajet_annonce + ", fumeur_annonce=" + fumeur_annonce + ", music_annonce=" + music_annonce + ", bagage_annonce=" + bagage_annonce + ", animaux_annonce=" + animaux_annonce + ", heure_depart_annonce=" + heure_depart_annonce + ", date_depart_annonce=" + date_depart_annonce + ", climatisation_annonce=" + climatisation_annonce + ", confort_annonce=" + confort_annonce + ", login_conducteur=" + login_conducteur + ", login_position_depart=" + login_position_depart + ", login_position_arrive=" + login_position_arrive + ", login_position_arret1=" + login_position_arret1 + ", login_position_arret2=" + login_position_arret2 + ", login_position_arret3=" + login_position_arret3 + ", login_position_arret4=" + login_position_arret4 + ", login_position_arret5=" + login_position_arret5 + ", login_position_arret6=" + login_position_arret6 + ", etat_annonce=" + etat_annonce + '}';
    }

       
            
            
            
            
            
}
