/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.DAO;

import java.sql.PreparedStatement;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;
import tn.edu.esprit.covoiturage.Util.MyConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;


/**
 *
 * @author amine kh
 */
public class UtilisateurDAO {
    
     

     
     public int findnbAnnonceByUtilisateur(int i) {
        String requete = "select count(*) from utilisateur U, annonce A , "
                + "where U.id_utilisateur = A.id_conducteur";
        
        int nbAnnonce=0;
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, i);
            ResultSet resultat = ps.executeQuery();

            //Gouvernorat Gov = new Gouvernorat();
            while (resultat.next()) {nbAnnonce = resultat.getInt(1);}
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
        }
        System.out.println(nbAnnonce);
        return nbAnnonce;
        
    }

      public List<Utilisateur> findBy(String champ,String lib){
if(champ.equals("Login"))
    champ="login_utilisateur";
if(champ.equals("Nom"))
    champ="nom_utilisateur";
if(champ.equals("Prenom"))
    champ="prenom_utilisateur";
if(champ.equals("Date de naissance"))
    champ="date_naiss_utilisateur";
if(champ.equals("Sexe"))
    champ="sexe_utilisateur";
if(champ.equals("Telephone"))
    champ="tel_utilisateur";
if(champ.equals("E_mail"))
    champ="mail_utilisateur";
if(champ.equals("Note"))
    champ="note_utilisateur";



        String requete = "select * from utilisateur where "+champ+"=?";

        try{

        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ps.setString(1, lib);
                List<Utilisateur> listeUser = new ArrayList<Utilisateur>();

        ResultSet resultat = ps.executeQuery();
        while (resultat.next()){
            Utilisateur utilisateur=new Utilisateur();

               utilisateur.setLogin_utilisateur(resultat.getString(2));
               utilisateur.setMdp_utilisateur(resultat.getString(3));
               utilisateur.setNom_utilisateur(resultat.getString(4));
               utilisateur.setPrenom_utilisateur(resultat.getString(5));
               utilisateur.setDate_naiss_utilisateur(resultat.getString(6));
               utilisateur.setSexe_utilisateur(resultat.getString(7));
               utilisateur.setTel_utilisateur(resultat.getString(8));              
               utilisateur.setType_utilisateur(resultat.getInt(9));
               utilisateur.setStatut_utilisateur(resultat.getInt(10));
               utilisateur.setMail_utilisateur(resultat.getString(11));
               utilisateur.setNote_utlisateur(resultat.getDouble(12));

                          listeUser.add(utilisateur);

        }
        return listeUser;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
    }
    

    public boolean UpdateStatutUser(String login,String statut){
        String requete = "update utilisateur set statut_utilisateur=? where login_utilisateur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);

            ps.setString(1, statut);
            ps.setString(2, login);
            ps.executeUpdate();
            System.out.println("Compte desactive");
            return true;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
       return false;
        }
        
        
    
}
   
    
      public List<Utilisateur> DisplayAllUser (){


        List<Utilisateur> listeUser = new ArrayList<Utilisateur>();

        String requete = "select * from utilisateur";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
            while(resultat.next()){
               Utilisateur utilisateur = new Utilisateur();

              utilisateur.setLogin_utilisateur(resultat.getString(2));
               utilisateur.setMdp_utilisateur(resultat.getString(3));
               utilisateur.setNom_utilisateur(resultat.getString(4));
               utilisateur.setPrenom_utilisateur(resultat.getString(5));
               utilisateur.setDate_naiss_utilisateur(resultat.getString(6));
               utilisateur.setSexe_utilisateur(resultat.getString(7));
               utilisateur.setTel_utilisateur(resultat.getString(8));              
               utilisateur.setType_utilisateur(resultat.getInt(9));
               utilisateur.setStatut_utilisateur(resultat.getInt(10));
               utilisateur.setMail_utilisateur(resultat.getString(11));
               utilisateur.setNote_utlisateur(resultat.getDouble(12));

               listeUser.add(utilisateur);

            }
            return listeUser;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
      }

    
      
      
    public void updateUser(String login,Utilisateur ul){
        String requete = "update utilisateur set login_utilisateur=? , mdp_utilisateur=? ,nom_utilisateur=? ,prenom_utilisateur=? ,date_naiss_utilisateur=? ,sexe_utilisateur=?,tel_utilisateur=?,type_utilisateur=?,statut_utilisateur=?,mail_utilisateur=?,note_utilisateur=? where login_utilisateur=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ul.getLogin_utilisateur());
            ps.setString(2, ul.getMdp_utilisateur());
            ps.setString(3, ul.getNom_utilisateur());
            ps.setString(4, ul.getPrenom_utilisateur());
            ps.setString(5, ul.getDate_naiss_utilisateur());
            ps.setString(6, ul.getSexe_utilisateur());
            ps.setString(7, ul.getTel_utilisateur());
            ps.setInt(8, ul.getType_utilisateur() );
            ps.setInt(9, ul.getStatut_utilisateur());
            
            ps.setString(10, ul.getMail_utilisateur());
            ps.setDouble(11, ul.getNote_utlisateur());
            ps.setString(12, login);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    
     public void insertUser(Utilisateur ul){

        String requete = "insert into utilisateur(login_utilisateur,mdp_utilisateur,nom_utilisateur,prenom_utilisateur,date_naiss_utilisateur,sexe_utilisateur,tel_utilisateur,type_utilisateur,statut_utilisateur,mail_utilisateur) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, ul.getLogin_utilisateur());
            ps.setString(2, ul.getMdp_utilisateur());
            ps.setString(3, ul.getNom_utilisateur());
            ps.setString(4, ul.getPrenom_utilisateur());
            ps.setString(5, ul.getDate_naiss_utilisateur());
            ps.setString(6, ul.getSexe_utilisateur());
            ps.setString(7, ul.getTel_utilisateur());
            ps.setInt(8, ul.getType_utilisateur() );
            ps.setInt(9, ul.getStatut_utilisateur());
            ps.setString(10, ul.getMail_utilisateur());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {

          System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
            
    }

     
     
     
      public List<Utilisateur> DisplayAllStatutUser (String statut){


        List<Utilisateur> listeUser = new ArrayList<Utilisateur>();

        String requete = "select * from utilisateur where statut_utilisateur="+statut;
        try {
           Statement statement = MyConnection.getInstance().createStatement();
           
            ResultSet resultat = statement.executeQuery(requete);
            UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
            while(resultat.next()){
               Utilisateur utilisateur = new Utilisateur();

              utilisateur.setLogin_utilisateur(resultat.getString(2));
               utilisateur.setMdp_utilisateur(resultat.getString(3));
               utilisateur.setNom_utilisateur(resultat.getString(4));
               utilisateur.setPrenom_utilisateur(resultat.getString(5));
               utilisateur.setDate_naiss_utilisateur(resultat.getString(6));
               utilisateur.setSexe_utilisateur(resultat.getString(7));
               utilisateur.setTel_utilisateur(resultat.getString(8));              
               utilisateur.setType_utilisateur(resultat.getInt(9));
               utilisateur.setStatut_utilisateur(resultat.getInt(10));
               utilisateur.setMail_utilisateur(resultat.getString(11));
               utilisateur.setNote_utlisateur(resultat.getDouble(12));

               listeUser.add(utilisateur);

            }
            return listeUser;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
      }

    
      
}