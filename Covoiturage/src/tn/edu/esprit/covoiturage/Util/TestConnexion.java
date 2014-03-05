/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.covoiturage.Util;

//import DAO.DAOAdmin;

import java.util.ArrayList;
import java.util.List;
import tn.edu.esprit.covoiturage.DAO.AnnonceDAO;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.Entities.Annonce;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;

//import Entities.Admin;

/**
 *
 * @author AMINE
 */
public class TestConnexion {

    public static void main(String[] args) {
        AnnonceDAO u=new AnnonceDAO();
     u.reserverAnnonce("sfax", "9999");
        }
}
