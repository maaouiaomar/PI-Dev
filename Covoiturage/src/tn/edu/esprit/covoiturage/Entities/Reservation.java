/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.edu.esprit.covoiturage.Entities;

/**
 *
 * @author amine kh
 */
public class Reservation {
    
    public int id_reservation ;
    public int 	id_annonce ;
    public int id_passager ;

    public Reservation(int id_reservation, int id_annonce, int id_passager) {
        this.id_reservation = id_reservation;
        this.id_annonce = id_annonce;
        this.id_passager = id_passager;
    }

    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    public int getId_passager() {
        return id_passager;
    }

    public void setId_passager(int id_passager) {
        this.id_passager = id_passager;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Reservation other = (Reservation) obj;
        if (this.id_reservation != other.id_reservation) {
            return false;
        }
        if (this.id_annonce != other.id_annonce) {
            return false;
        }
        if (this.id_passager != other.id_passager) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id_reservation=" + id_reservation + ", id_annonce=" + id_annonce + ", id_passager=" + id_passager + '}';
    }
    
    
}
