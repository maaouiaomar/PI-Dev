/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.Entities;

import java.util.Objects;

/**
 *
 * @author amine kh
 */
public class Evaluation {
    
    private int id_evaluation;
    private int note_evaluation;
    private String commentaire_evaluation;        
    private int id_conducteur;
    private int id_passager;

    public int getId_evaluation() {
        return id_evaluation;
    }

    public void setId_evaluation(int id_evaluation) {
        this.id_evaluation = id_evaluation;
    }

    public int getNote_evaluation() {
        return note_evaluation;
    }

    public void setNote_evaluation(int note_evaluation) {
        this.note_evaluation = note_evaluation;
    }

    public String getCommentaire_evaluation() {
        return commentaire_evaluation;
    }

    public void setCommentaire_evaluation(String commentaire_evaluation) {
        this.commentaire_evaluation = commentaire_evaluation;
    }

    public int getId_conducteur() {
        return id_conducteur;
    }

    public void setId_conducteur(int id_conducteur) {
        this.id_conducteur = id_conducteur;
    }

    public int getId_passager() {
        return id_passager;
    }

    public void setId_passager(int id_passager) {
        this.id_passager = id_passager;
    }

    public Evaluation(int id_evaluation, int note_evaluation, String commentaire_evaluation, int id_conducteur, int id_passager) {
        this.id_evaluation = id_evaluation;
        this.note_evaluation = note_evaluation;
        this.commentaire_evaluation = commentaire_evaluation;
        this.id_conducteur = id_conducteur;
        this.id_passager = id_passager;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evaluation other = (Evaluation) obj;
        if (this.id_evaluation != other.id_evaluation) {
            return false;
        }
        if (this.note_evaluation != other.note_evaluation) {
            return false;
        }
        if (!Objects.equals(this.commentaire_evaluation, other.commentaire_evaluation)) {
            return false;
        }
        if (this.id_conducteur != other.id_conducteur) {
            return false;
        }
        if (this.id_passager != other.id_passager) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "id_evaluation=" + id_evaluation + ", note_evaluation=" + note_evaluation + ", commentaire_evaluation=" + commentaire_evaluation + ", id_conducteur=" + id_conducteur + ", id_passager=" + id_passager + '}';
    }
    
    
            
}
