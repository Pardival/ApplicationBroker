/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.controllers;

import core.entities.Compte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author KevinDufour
 */
@Stateless
public class CompteFacade extends AbstractFacade<Compte> implements CompteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_ApplicationBroker-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteFacade() {
        super(Compte.class);
    }
    
}