/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.covoiturage.Controlers;

import tn.edu.esprit.covoiturage.Entities.Utilisateur;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author Issam
 */
public class CtrlAjoutUser {

    public static void ajouterUser(Utilisateur ul) throws ParseException {
        UtilisateurDAO ulDao = new UtilisateurDAO();
      //  System.out.println(ph.toString());
        ulDao.insertUser(ul);
    }
    //tester si l'adresse mail est valide
    public static boolean isValidEmail(String Email)
    {boolean result = true;
        try{
        
        InternetAddress emailAddr = new InternetAddress(Email);
        emailAddr.validate();
      
        
    }   catch (AddressException ex) {
            result = false ;
           
        }
    return result;
    
}
    
public static boolean IsPhoneNumber(String Tel){
   int number=0;
   if(Tel.length()==8){
       try {
           number=Integer.parseInt(Tel);
           return true;
    } catch (Exception e) {
        return false;
    }
        
    }
    return false;
}


public static boolean IsSamePass(String pass,String passConf){
   
   if(pass.equals(passConf)){
       
           return true;
     
    }
    return false;
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