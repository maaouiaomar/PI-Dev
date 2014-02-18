/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.dao;

import java.util.List;

/**
 *
 * @author labib
 */
public interface IDao<E,I> {
     
    public void create();// creer une table
    public  boolean insert(E obj);//inserrer dans une table
    public  List<E> readAll();//lister 
    public  E readByID(I id);//chercher
    public boolean update(E obj);
    public boolean delete (E obj);
  
}
