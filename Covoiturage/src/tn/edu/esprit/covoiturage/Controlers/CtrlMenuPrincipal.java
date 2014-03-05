/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.covoiturage.Controlers;

import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.DAO.AnnonceDAO;
import tn.edu.esprit.covoiturage.Entities.Annonce;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;
//import DAO.DAOGouvernorat;
//import DAO.DAOPharmacie;
//import DAO.DAOVille;
//import Entities.Gouvernorat;
//import Entities.Pharmacie;
//import Entities.Ville;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tn.edu.esprit.covoiturage.Util.MyConnection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tn.edu.esprit.covoiturage.GUI.AffichageUser;
//import net.proteanit.sql.DbUtils;

/**
 *
 * @author amine kh
 */
public class CtrlMenuPrincipal {
    
//    
//    public static Vector<Vector<String>> getdata(boolean notif) throws SQLException{
//       UtilisateurDAO us=new UtilisateurDAO();
//        
//        Vector <Vector<String>>t=us.GetAllData(notif);
//        for (Vector<String> st:t) {
//            for (String ts:st) {
//                System.out.print(ts+" ---");
//            }
//            System.out.println("    "); 
//        }
//       
//        return t;
//        
//    
//   }
       public static void UpdateJtable(JTable t,boolean tb) {
       String sql;
         sql= "select * from utilisateur where statut_utilisateur=1;";
      
        try {
            java.sql.PreparedStatement prs = MyConnection.getInstance().prepareStatement(sql);
            ResultSet rs = prs.executeQuery();
            t.setModel(new AffichageUser("act"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
//    public static Pharmacie AcceptPharmacie(int id){
//        DAOPharmacie daoph=new DAOPharmacie();
//        daoph.AcceptePharmacie(id);
//        Pharmacie ph=daoph.findPharmacieByID(id);
//        return ph;
//    }
//    public static void DataInsert(DefaultTableModel m, JTable t,Vector<Vector<String>>  dataNotif,Vector<Vector<String>>  dataPhar) 
//            throws SQLException{
//          
//   dataPhar=getdata(true);
//        dataNotif=getdata(false);
//        m.fireTableRowsInserted(0,m.getRowCount()+1);
//    t.setModel(m); 
//  }
//   public static void DataDelete(DefaultTableModel m, JTable t,Vector<Vector<String>>  dataNotif,Vector<Vector<String>>  dataPhar) 
//            throws SQLException{
//          
//   dataPhar=getdata(true);
//        dataNotif=getdata(false);
//        m.fireTableRowsDeleted(0,m.getRowCount());
//    t.setModel(m); 
//  }
//     public static Vector<String> getAllGov(){
//         Vector<String> nom=new Vector<String>();
//         Vector<Gouvernorat> gov=new Vector<Gouvernorat>();
//         DAOGouvernorat govs=new DAOGouvernorat();
//         gov=govs.GetAllData();
//         for (Gouvernorat t :gov) {
//            nom.add(t.getNom());
//         }
//         return nom;
//     }
//     public static Vector<String> getVillesByGov(int id){
//           Vector<String> nom=new Vector<String>();
//         Vector<Ville> ville=new Vector<Ville>();
//         DAOVille villes=new DAOVille();
//         ville=villes.FindVillesByGov(id);
//         for (Ville t :ville) {
//            nom.add(t.getNom());
//         }
//         return nom;
//     }
}
