/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.GUI;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.edu.esprit.covoiturage.DAO.AnnonceDAO;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.Entities.Annonce;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;

/**
 *
 * @author Aimen
 */
public class AffichageAnnonce extends AbstractTableModel {

    List<Annonce> listeul = new ArrayList<Annonce>();
    String[] headers = {"Libele","Type trajet","Lieux depart","Lieux arrive","Prix","Nbr de places dispo","heure depart","date de depart","Nom du conducteur"};

    public AffichageAnnonce(String etat) {
        AnnonceDAO andao = new AnnonceDAO();
        listeul = andao.findAnnonce( "Etat",etat);
        System.out.println("lllllaaa");


    }
    
    
    public AffichageAnnonce() {
        AnnonceDAO andao = new AnnonceDAO();
        listeul = andao.DisplayLastAnnonce();
        System.out.println("lllllaaa");


    }
    
    
    

//public AffichageAnnonce(String champ,String lib){
//    
//UtilisateurDAO uldao =new UtilisateurDAO();
//  listeul= uldao.findBy(champ,lib);
//    System.out.println(listeul+"llll");
//}
//
//public AffichageAnnonce(String lib){
//    
//UtilisateurDAO uldao =new UtilisateurDAO();
//  listeul=uldao.DisplayAllStatutUser(lib);
//}




    @Override
    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        switch(columnIndex)
        {
            case 0 :
                return listeul.get(rowIndex).getLibele_annonce();

            case 1 :
                return listeul.get(rowIndex).getType_annonce();

                 case 2 :
                return listeul.get(rowIndex).getLogin_position_depart();

                 case 3 :
                return listeul.get(rowIndex).getLogin_position_arrive();

                 case 4 :
                return listeul.get(rowIndex).getPrix_annonce();

                case 5:
                return listeul.get(rowIndex).getNbr_passager_annonce();

                case 6 :
                return listeul.get(rowIndex).getHeure_depart_annonce();

                case 7 :
                return listeul.get(rowIndex).getDate_depart_annonce();
                
                case 8 :
                return listeul.get(rowIndex).getLogin_conducteur();
               
                    

            default :
                        return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       return headers[column];
    }
    {

}

    @Override
    public int getRowCount() {
return listeul.size();
    }

    
}
