/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.GUI;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;

/**
 *
 * @author Aimen
 */
public class AffichageUser extends AbstractTableModel {

    List<Utilisateur> listeul = new ArrayList<Utilisateur>();
    String[] headers = {"Login","Mot de passe","Nom","Prenom","Date de naissance","Sex","Télephone","Statut","E_mail","Note"};

    public AffichageUser() {
        UtilisateurDAO uldao = new UtilisateurDAO();
        listeul = uldao.DisplayAllUser();
        System.out.println("lllllaaa");


    }

public AffichageUser(String champ,String lib){
    
UtilisateurDAO uldao =new UtilisateurDAO();
  listeul= uldao.findBy(champ,lib);
    System.out.println(listeul+"llll");
}

public AffichageUser(String lib){
    
UtilisateurDAO uldao =new UtilisateurDAO();
  listeul=uldao.DisplayAllStatutUser(lib);
}




    @Override
    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        switch(columnIndex)
        {
            case 0 :
                return listeul.get(rowIndex).getLogin_utilisateur();

                 case 1 :
                return listeul.get(rowIndex).getMdp_utilisateur();

                 case 2 :
                return listeul.get(rowIndex).getNom_utilisateur();

                 case 3 :
                return listeul.get(rowIndex).getPrenom_utilisateur();

                case 4 :
                return listeul.get(rowIndex).getDate_naiss_utilisateur();

                case 5 :
                return listeul.get(rowIndex).getSexe_utilisateur();

                case 6 :
                return listeul.get(rowIndex).getTel_utilisateur();
                
                case 7 :
                return listeul.get(rowIndex).getStatut_utilisateur();
                case 8 :
                return listeul.get(rowIndex).getMail_utilisateur();
                case 9 :
                return listeul.get(rowIndex).getNote_utlisateur();


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
