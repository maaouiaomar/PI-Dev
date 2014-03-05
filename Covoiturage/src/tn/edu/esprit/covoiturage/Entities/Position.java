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
public class Position {
    
    private int id_position;
    private String libele_position;
    private float latitude_position;        
    private float longitude_position;
    private String adresse_position;
    private String detail_position;

    public int getId_position() {
        return id_position;
    }

    public void setId_position(int id_position) {
        this.id_position = id_position;
    }

    public String getLibele_position() {
        return libele_position;
    }

    public void setLibele_position(String libele_position) {
        this.libele_position = libele_position;
    }

    public float getLatitude_position() {
        return latitude_position;
    }

    public void setLatitude_position(float latitude_position) {
        this.latitude_position = latitude_position;
    }

    public float getLongitude_position() {
        return longitude_position;
    }

    public void setLongitude_position(float longitude_position) {
        this.longitude_position = longitude_position;
    }

    public String getAdresse_position() {
        return adresse_position;
    }

    public void setAdresse_position(String adresse_position) {
        this.adresse_position = adresse_position;
    }

    public String getDetail_position() {
        return detail_position;
    }

    public void setDetail_position(String detail_position) {
        this.detail_position = detail_position;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Position other = (Position) obj;
        if (this.id_position != other.id_position) {
            return false;
        }
        if (!Objects.equals(this.libele_position, other.libele_position)) {
            return false;
        }
        if (Float.floatToIntBits(this.latitude_position) != Float.floatToIntBits(other.latitude_position)) {
            return false;
        }
        if (Float.floatToIntBits(this.longitude_position) != Float.floatToIntBits(other.longitude_position)) {
            return false;
        }
        if (!Objects.equals(this.adresse_position, other.adresse_position)) {
            return false;
        }
        if (!Objects.equals(this.detail_position, other.detail_position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Position{" + "id_position=" + id_position + ", libele_position=" + libele_position + ", latitude_position=" + latitude_position + ", longitude_position=" + longitude_position + ", adresse_position=" + adresse_position + ", detail_position=" + detail_position + '}';
    }

    public Position(int id_position, String libele_position, float latitude_position, float longitude_position, String adresse_position, String detail_position) {
        this.id_position = id_position;
        this.libele_position = libele_position;
        this.latitude_position = latitude_position;
        this.longitude_position = longitude_position;
        this.adresse_position = adresse_position;
        this.detail_position = detail_position;
    }
    
    
    

    
    
}
