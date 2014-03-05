/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.DAO;

import tn.edu.esprit.covoiturage.Entities.Annonce;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import tn.edu.esprit.covoiturage.Util.MyConnection;

/**
 *
 * @author amine kh
 */
public class AnnonceDAO {
    
    DateFormat df = new SimpleDateFormat("hh:mm:ss");
    
         
        public void insertAnnonce(Annonce an){

        String requete = "insert into annonce ( `libele_annonce`, `nbr_passager_annonce`, `prix_annonce`, `type_annonce`, `type_trajet_annonce`, `fumeur_annonce`, `music_annonce`, `bagage_annonce`, `animaux_annonce`, `heure_depart_annonce`, `date_depart_annonce`, `climatisation_annonce`, `confort_annonce`, `id_conducteur`, `id_position_depart`, `id_position_arrive`,`id_position_arret1`,`id_position_arret2`,`id_position_arret3`,`id_position_arret4`,`id_position_arret5`,`id_position_arret6`) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,an.getLibele_annonce());
            ps.setInt(2,an.getNbr_passager_annonce());
            ps.setInt(3, an.getPrix_annonce());
            ps.setString(4, an.getType_annonce());
            ps.setString(5, an.getType_trajet_annonce());
            ps.setInt(6, an.getFumeur_annonce());
            ps.setInt(7, an.getMusic_annonce());
            ps.setInt(8, an.getBagage_annonce());
            ps.setInt(9, an.getAnimaux_annonce());
            ps.setString(10, an.getHeure_depart_annonce());
            ps.setString(11, an.getDate_depart_annonce());
            ps.setInt(12, an.getClimatisation_annonce());
            ps.setInt(13, an.getConfort_annonce());
            ps.setString(14, an.getLogin_conducteur());
            ps.setString(15, an.getLogin_position_depart());
            ps.setString(16, an.getLogin_position_arrive());
            ps.setString(17, an.getLogin_position_arret1());
            ps.setString(18, an.getLogin_position_arret2());
            ps.setString(19, an.getLogin_position_arret3());
            ps.setString(20, an.getLogin_position_arret4());
            ps.setString(21, an.getLogin_position_arret5());
            ps.setString(22, an.getLogin_position_arret6());

            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {

          System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }

    }
         
        public List<Annonce> DisplayAllAnnonce (){


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();

        String requete = "select * from annonce";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Annonce an =new Annonce();
an.setLibele_annonce(resultat.getString(2));
an.setNbr_passager_annonce(resultat.getInt(3));
an.setPrix_annonce(resultat.getInt(4));
an.setType_annonce(resultat.getString(5));
an.setType_trajet_annonce(resultat.getString(6));
an.setFumeur_annonce(resultat.getInt(7));
an.setMusic_annonce(resultat.getInt(8));
an.setBagage_annonce(resultat.getInt(9));
an.setAnimaux_annonce(resultat.getInt(10));
an.setHeure_depart_annonce(resultat.getString(11));
an.setDate_depart_annonce(resultat.getString(12));
an.setClimatisation_annonce(resultat.getInt(13));
an.setConfort_annonce(resultat.getInt(14));
an.setLogin_conducteur(resultat.getString(15));
an.setLogin_position_depart(resultat.getString(16));
an.setLogin_position_arrive(resultat.getString(17));
an.setLogin_position_arret1(resultat.getString(18));
an.setLogin_position_arret2(resultat.getString(19));
an.setLogin_position_arret3(resultat.getString(20));
an.setLogin_position_arret4(resultat.getString(21));
an.setLogin_position_arret5(resultat.getString(22));
an.setLogin_position_arret6(resultat.getString(23));
an.setEtat_annonce(resultat.getInt(24));
        listeAnnonce.add(an);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
          
        public void updateAnnonce(String lib,Annonce an){
        String requete = "update annonce set libele_annonce=?, nbr_passager_annonce=?, prix_annonce=?, type_annonce=?, type_trajet_annonce=?, fumeur_annonce=?, music_annonce=?, bagage_annonce=?, animaux_annonce=?, heure_depart_annonce=?, date_depart_annonce=?, climatisation_annonce=?, confort_annonce=?, id_conducteur=? , id_position_depart=? , id_position_arrive=?,id_position_arret1=?,id_position_arret2=?,id_position_arret3=?,id_position_arret4=?,id_position_arret5=?,id_position_arret6=?,etat_annonce=? where libele_annonce=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,an.getLibele_annonce());
            ps.setInt(2,an.getNbr_passager_annonce());
            ps.setInt(3, an.getPrix_annonce());
            ps.setString(4, an.getType_annonce());
            ps.setString(5, an.getType_trajet_annonce());
            ps.setInt(6, an.getFumeur_annonce());
            ps.setInt(7, an.getMusic_annonce());
            ps.setInt(8, an.getBagage_annonce());
            ps.setInt(9, an.getAnimaux_annonce());
            ps.setString(10, an.getHeure_depart_annonce());
            ps.setString(11, an.getDate_depart_annonce());
            ps.setInt(12, an.getClimatisation_annonce());
            ps.setInt(13, an.getConfort_annonce());
            ps.setString(14, an.getLogin_conducteur());
            ps.setString(15, an.getLogin_position_depart());
            ps.setString(16, an.getLogin_position_arrive());
            ps.setString(17, an.getLogin_position_arret1());
            ps.setString(18, an.getLogin_position_arret2());
            ps.setString(19, an.getLogin_position_arret3());
            ps.setString(20, an.getLogin_position_arret4());
            ps.setString(21, an.getLogin_position_arret5());
            ps.setString(22, an.getLogin_position_arret6());
            ps.setInt(23, an.getEtat_annonce());
            
           ps.setString(23, lib);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
        public List<Annonce> findAnnonce(String champ,String lib) {
            if(champ.equals("Libele")){
                champ="libele_annonce";
            }
            if(champ.equals("Nbr passager")){
                champ="nbr_passager_annonce";
            }
            if(champ.equals("Prix")){
                champ="prix_annonce";
            }
            if(champ.equals("Type")){
                champ="type_annonce";
            }
            if(champ.equals("Type trajet")){
                champ="type_trajet_annonce";
            }
            if(champ.equals("Fumeur")){
                champ="fumeur_annonce";
            }
           
            if(champ.equals("Music")){
                champ="music_annonce";
            }
            if(champ.equals("Bagage")){
                champ="bagage_annonce";
            }
            if(champ.equals("Animaux")){
                champ="animaux_annonce";
            }
            if(champ.equals("Heure")){
                champ="heure_depart_annonce";
            }
            if(champ.equals("Date")){
                champ="date_depart_annonce";
            }
            if(champ.equals("Climatiseur")){
                champ="climatision_annonce";
            }
            if(champ.equals("Confort")){
                champ="confort_annonce";
            }
            if(champ.equals("Etat")){
                champ="etat_annonce";
            }
           
            
            
            
        String requete = "select * from annonce where "+champ+"='"+lib+"'";

        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           // ps.setString(1, champ);
          //  ps.setString(2, lib);
            ResultSet resultat = ps.executeQuery();
List<Annonce> la=new ArrayList<Annonce>();
            
            while (resultat.next()) {
            Annonce an = new Annonce();
                an.setLibele_annonce(resultat.getString(2));
                an.setNbr_passager_annonce(resultat.getInt(3));
                an.setPrix_annonce(resultat.getInt(4));
                an.setType_annonce(resultat.getString(5));
                an.setType_trajet_annonce(resultat.getString(6));
                an.setFumeur_annonce(resultat.getInt(7));
                an.setMusic_annonce(resultat.getInt(8));
                an.setBagage_annonce(resultat.getInt(9));
                an.setAnimaux_annonce(resultat.getInt(10));
                an.setHeure_depart_annonce(resultat.getString(11));
                an.setDate_depart_annonce(resultat.getString(12));
                an.setClimatisation_annonce(resultat.getInt(13));
                an.setConfort_annonce(resultat.getInt(14));
                an.setLogin_conducteur(resultat.getString(15));
an.setLogin_position_depart(resultat.getString(16));
an.setLogin_position_arrive(resultat.getString(17));
an.setLogin_position_arret1(resultat.getString(18));
an.setLogin_position_arret2(resultat.getString(19));
an.setLogin_position_arret3(resultat.getString(20));
an.setLogin_position_arret4(resultat.getString(21));
an.setLogin_position_arret5(resultat.getString(22));
an.setLogin_position_arret6(resultat.getString(23));
                an.setEtat_annonce(resultat.getInt(24));
la.add(an);
            }
            return la;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }
    }
        
          
        public void etatAnnonce(String lib,String etat){
        String requete = "update annonce set etat_annonce=? where libele_annonce=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete); 
            ps.setString(1, etat);
            ps.setString(2, lib);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
        
         public List<Annonce> DisplayLastAnnonce (){


        List<Annonce> listeAnnonce = new ArrayList<Annonce>();

        String requete = "select * from annonce where date_depart_annonce<=(select curdate()) order by date_depart_annonce desc limit 10";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Annonce an =new Annonce();
an.setLibele_annonce(resultat.getString(2));
an.setNbr_passager_annonce(resultat.getInt(3));
an.setPrix_annonce(resultat.getInt(4));
an.setType_annonce(resultat.getString(5));
an.setType_trajet_annonce(resultat.getString(6));
an.setFumeur_annonce(resultat.getInt(7));
an.setMusic_annonce(resultat.getInt(8));
an.setBagage_annonce(resultat.getInt(9));
an.setAnimaux_annonce(resultat.getInt(10));
an.setHeure_depart_annonce(resultat.getString(11));
an.setDate_depart_annonce(resultat.getString(12));
an.setClimatisation_annonce(resultat.getInt(13));
an.setConfort_annonce(resultat.getInt(14));
an.setLogin_conducteur(resultat.getString(15));
an.setLogin_position_depart(resultat.getString(16));
an.setLogin_position_arrive(resultat.getString(17));
an.setLogin_position_arret1(resultat.getString(18));
an.setLogin_position_arret2(resultat.getString(19));
an.setLogin_position_arret3(resultat.getString(20));
an.setLogin_position_arret4(resultat.getString(21));
an.setLogin_position_arret5(resultat.getString(22));
an.setLogin_position_arret6(resultat.getString(23));
an.setEtat_annonce(resultat.getInt(24));
        listeAnnonce.add(an);
            }
            return listeAnnonce;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
     
         
         
         
         public void reserverAnnonce(String lib,String nbr){
        String requete = "update annonce set  nbr_passager_annonce=? where libele_annonce=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           ps.setString(1, nbr);
           ps.setString(2, lib);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
         
         
  
}
