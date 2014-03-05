/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.Controlers;

import java.util.ArrayList;
import java.util.List;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;

/**
 *
 * @author amine kh
 */
public class CtrlModifUser {
       public static void modifieruser(String login,Utilisateur ul) {
        UtilisateurDAO ulDao = new UtilisateurDAO();
      //  System.out.println(ph.toString());
        ulDao.updateUser(login,ul);
    }
       
       public static boolean IsUsed(String login){
   UtilisateurDAO ulDao=new UtilisateurDAO();
           List<Utilisateur>lu=new ArrayList<Utilisateur>();
lu=ulDao.findBy("Login", login);
   if(lu.isEmpty()){
       
           return true;
     
    }
    return false;
}

       
    
    
}
