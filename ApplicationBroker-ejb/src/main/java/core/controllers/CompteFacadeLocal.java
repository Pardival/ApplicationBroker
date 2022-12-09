/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controllers;

import core.entities.Compte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author KevinDufour
 */
@Local
public interface CompteFacadeLocal {

    void create(Compte compte);

    void edit(Compte compte);

    void remove(Compte compte);

    Compte find(Object id);

    List<Compte> findAll();

    List<Compte> findRange(int[] range);

    int count();
    
    ////////////////////////////////////////
    
    Compte ajouter(Compte compte);
    
    Compte supprimer(Compte compte);
    
    Compte modifier(Compte compte);
    
}
