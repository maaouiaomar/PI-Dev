/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.covoiturage.Controlers;


import java.util.ArrayList;
import java.util.List;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
//import DAO.DAOPharmacie;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;
//import Entities.Pharmacie;

/**
 *
 * @author aminek kh 
 */
public class CtrlLogin {

    public static boolean VerifAdmin(String login, String pwd) {
       UtilisateurDAO d = new UtilisateurDAO();
               List<Utilisateur>lu=new ArrayList<Utilisateur>();
 
       lu = d.findBy("Login", login);
       if (lu.get(0).getLogin_utilisateur()== null )
            System.out.println("login erroné");
       else if (lu.get(0).getMdp_utilisateur().equals(pwd) && lu.get(0).getLogin_utilisateur().equals(login)) {
            return true;

        }
        return false;
    }
//    public static Pharmacie getPharmcien(int Cin){
//         DAOPharmacie dao = new DAOPharmacie();
//        Pharmacie ph = dao.findPharmacieByCin(Cin);
//        return ph;
//    }
//    public static boolean VerifPharma(String login, String pwd) {
//        DAOPharmacie dao = new DAOPharmacie();
//        Pharmacie ph = dao.findPharmacieByCin(Integer.parseInt(login));
//       if (ph.getLogin()== null )
//            System.out.println("login erroné");
//       else if (ph.getMdp().equals(pwd) && ph.getLogin().equals(login)) {
//           System.out.println(ph.getLogin()+" -----"+ph.getMdp());
//            return true;
//
//        }
//        System.out.println(ph.getLogin()+" -----"+ph.getMdp());
//        return false;
//    }
}
