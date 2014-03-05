/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.edu.esprit.covoiturage.Controlers;

//import DAO.DAOGouvernorat;
import tn.edu.esprit.covoiturage.DAO.AnnonceDAO;
//import Entities.Gouvernorat;
import tn.edu.esprit.covoiturage.Entities.Annonce;
import java.awt.Color;
import org.jfree.chart.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.data.category.*;
import org.jfree.data.general.DefaultPieDataset;
import tn.edu.esprit.covoiturage.DAO.UtilisateurDAO;
import tn.edu.esprit.covoiturage.Entities.Utilisateur;

/**
 *
 * @author amine kh
 */
public class ctrlChart {
    public static void nbPharmaParGougernorat() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        UtilisateurDAO du = new UtilisateurDAO();
        Utilisateur u;
        String nomUtili ;
        int nbAnnonce =0 ;
        //boucle pour la recherche des noms des gouvernorats ainsi que le nombre
        //des pharmacies dans ce gouvernorat
        for (int i = 1; i < 10; i++) {
            u = du.findUtilisateurById(i);
            
            nomUtili = u.getNom_utilisateur();
            
            nbAnnonce = du.findnbAnnonceByUtilisateur(i);
        
            dataset.setValue(nbAnnonce, "ordonnées", nomUtili);
        }   
        JFreeChart chart = ChartFactory.createBarChart("nombre des annonces par utilisateur", "Annonces", "nombre d'utilisateur", dataset, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot p = chart.getCategoryPlot();
        
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("nombre des annonces par utilisateur", chart);
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }
//    public static void ServiceStat(){
//        AnnonceDAO dao=new AnnonceDAO();
//         DefaultPieDataset piData = new DefaultPieDataset();
//        piData.setValue("Commande Medicament", dao.findnbService1(1));
//        piData.setValue("Services Domicile ", dao.findnbService1(2));
//        piData.setValue("Livraison Medicament ", dao.findnbService1(3));
//        JFreeChart chart = ChartFactory.createPieChart("Les Services ", piData);
//        
//        PiePlot p = (PiePlot) chart.getPlot();
//        ChartFrame frame = new ChartFrame("Pie Chart", chart);
//        frame.setVisible(true);
//        //   ChartPanel myChart = new ChartPanel(p);
//
//        frame.setSize(500, 250);
//        //panelChart.add(myChart);
//        //panelChart.validate();
//
//    }
}
